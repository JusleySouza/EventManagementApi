package com.ju.eventmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ju.eventmanagement.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

}
