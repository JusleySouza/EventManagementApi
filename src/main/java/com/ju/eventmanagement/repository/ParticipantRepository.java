package com.ju.eventmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ju.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
