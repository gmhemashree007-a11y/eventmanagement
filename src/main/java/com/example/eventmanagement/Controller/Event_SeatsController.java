package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Event_Seats;
import com.example.eventmanagement.Service.Event_SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event_seats")
public class Event_SeatsController {
    @Autowired
    Event_SeatsService eventSeatsService;

    @PostMapping("/insert")
    public Event_Seats insert(@RequestBody Event_Seats eventSeats)
    {
        return eventSeatsService.insert(eventSeats);
    }

    @PostMapping("/insertmany")
    public List<Event_Seats> insertmany(@RequestBody List<Event_Seats> eventSeats)
    {
        return eventSeatsService.insertmany(eventSeats);
    }

    @GetMapping("/fetch")
    public List<Event_Seats> fetch()
    {
        return eventSeatsService.fetch();
    }

    @GetMapping("/fetch/{id}")
    public Event_Seats fetchbyid(@PathVariable Integer id)
    {
        return eventSeatsService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public Event_Seats update(@PathVariable Integer id,@RequestBody Event_Seats eventSeats)
    {
        return eventSeatsService.update(id,eventSeats);
    }

    @DeleteMapping("/delete/{id}")
    public Event_Seats delete(@PathVariable Integer id)
    {
        return eventSeatsService.delete(id);
    }
}
