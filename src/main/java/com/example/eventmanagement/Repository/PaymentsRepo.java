package com.example.eventmanagement.Repository;

import com.example.eventmanagement.Entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepo extends JpaRepository<Payments,Integer> {
}
