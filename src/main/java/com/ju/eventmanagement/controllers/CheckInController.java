package com.ju.eventmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ju.eventmanagement.controllers.exceptions.AlreadyCheckedInException;
import com.ju.eventmanagement.entities.Participant;
import com.ju.eventmanagement.repository.ParticipantRepository;

@RepositoryRestController
public class CheckInController {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@PostMapping("/checkin/{id}")
	public ResponseEntity<PersistentEntityResource> checkIn(@PathVariable Long id, PersistentEntityResourceAssembler assembler){
		Participant participant = participantRepository.findById(id).get();
		if(participant != null) {
			if(participant.getCheckedIn()) {
				throw new AlreadyCheckedInException();
			}
			participant.setCheckedIn(true);
			participantRepository.save(participant);
		}
		return ResponseEntity.ok(assembler.toFullResource(participant));
	}

}
