package com.example.eventmanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payments {
    @Id
    private Integer payment_id;
    //@ManyToOne
    //@JoinColumn(name = "booking_id");
    //private Bookings booking_id;
    private Double amount;
    private String payment_method;
    private String payment_status;
    private String transaction_id;
    private String payment_date;
}
