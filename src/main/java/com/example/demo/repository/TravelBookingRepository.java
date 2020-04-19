package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TravelBooking;
@Repository
public interface TravelBookingRepository extends JpaRepository<TravelBooking, Integer>{

}
