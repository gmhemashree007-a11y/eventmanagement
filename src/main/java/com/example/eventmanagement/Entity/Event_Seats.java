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
public class Event_Seats {
    @Id
    private Integer seat_id;
    //@ManyToOne
    //@JoinColumn(name = "event_id");
    //private Events events;
    private String seat_number;
    private String seat_status;
    private String seat_type;
}
