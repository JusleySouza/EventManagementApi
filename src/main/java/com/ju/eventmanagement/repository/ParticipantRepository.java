package com.ju.eventmanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.ju.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

	Page<Participant> findByIdAndEmail(@Param("id") Long id, @Param("email") String email, Pageable pageable);
	
}
