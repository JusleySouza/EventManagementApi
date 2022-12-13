package com.ju.eventmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ju.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
