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
public class Waitlist {
    @Id
    private Integer waitlist_id;
    //@ManyToOne
    //@JoinColumn(name = "user_id");
    //private Users users;
    //@ManyToOne
    //@JoinColumn(name = "event_id");
    //private Events events;
    private String requested_at;
    private String waitlist_status;
    private String position;
}
