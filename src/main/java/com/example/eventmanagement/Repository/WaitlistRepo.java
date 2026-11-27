package com.example.eventmanagement.Repository;

import com.example.eventmanagement.Entity.Waitlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaitlistRepo extends JpaRepository<Waitlist,Integer> {
}
