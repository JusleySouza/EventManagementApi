package com.ju.eventmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ju.eventmanagement.entities.Event;
import com.ju.eventmanagement.repository.EventRepository;

@RepositoryRestController
public class EventKickOffController {
	
	@Autowired
	private EventRepository eventRepository;
	
	@PostMapping("/start/{id}")
	public ResponseEntity start(@PathVariable Long id){
		Event event = eventRepository.findById(id).get();
		if(event == null) {
			throw new ResourceNotFoundException();
		}
		event.setStarted(true);
		eventRepository.save(event);
		return ResponseEntity.ok(event.getName() + "has started");
	}

}
