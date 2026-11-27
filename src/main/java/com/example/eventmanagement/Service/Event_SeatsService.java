package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Event_Seats;
import com.example.eventmanagement.Repository.Event_SeatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Event_SeatsService {
    @Autowired
    Event_SeatsRepo eventSeatsRepo;

    public Event_Seats insert(Event_Seats eventSeats)
    {
        return eventSeatsRepo.save(eventSeats);
    }

    public List<Event_Seats> insertmany(List<Event_Seats> eventSeats)
    {
        return eventSeatsRepo.saveAll(eventSeats);
    }

    public List<Event_Seats> fetch()
    {
        return eventSeatsRepo.findAll();
    }

    public Event_Seats fetchbyid(Integer id)
    {
        return eventSeatsRepo.findById(id).orElse(null);
    }

    public Event_Seats update(Integer id, Event_Seats eventSeats)
    {
        Event_Seats eventSeats1=eventSeatsRepo.findById(id).orElse(null);
        if(eventSeats1 !=null)
        {
            eventSeats1.setSeat_number(eventSeats.getSeat_number());
            //eventSeats1.setEvent_id(eventSeats.getEvent_id());
            eventSeats1.setSeat_type(eventSeats.getSeat_type());
            eventSeats1.setSeat_status(eventSeats.getSeat_status());
            return eventSeatsRepo.save(eventSeats1);
        }
        return null;
    }

    public Event_Seats delete(Integer id)
    {
        if(eventSeatsRepo.existsById(id))
        {
            eventSeatsRepo.deleteById(id);
            return null;
        }
        return null;
    }
}
