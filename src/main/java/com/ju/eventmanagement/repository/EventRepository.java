package com.ju.eventmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.ju.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
