package com.ju.eventmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ju.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
