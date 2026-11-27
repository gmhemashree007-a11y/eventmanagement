package com.example.eventmanagement.Repository;

import com.example.eventmanagement.Entity.Event_Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Event_SeatsRepo extends JpaRepository<Event_Seats,Integer> {
}
