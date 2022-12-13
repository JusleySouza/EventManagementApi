package com.ju.eventmanagement.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ju.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
