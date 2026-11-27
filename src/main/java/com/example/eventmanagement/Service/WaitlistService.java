package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Payments;
import com.example.eventmanagement.Entity.Waitlist;
import com.example.eventmanagement.Repository.PaymentsRepo;
import com.example.eventmanagement.Repository.WaitlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaitlistService {
    @Autowired
    WaitlistRepo waitlistRepo;

    public Waitlist insert(Waitlist waitlist)
    {
        return waitlistRepo.save(waitlist);
    }

    public List<Waitlist> insertmany(List<Waitlist> waitlists)
    {
        return waitlistRepo.saveAll(waitlists);
    }

    public List<Waitlist> fetch()
    {
        return waitlistRepo.findAll();
    }

    public Waitlist fetchbyid(Integer id)
    {
        return waitlistRepo.findById(id).orElse(null);
    }

    public Waitlist update(Integer id, Waitlist waitlist)
    {
        Waitlist waitlist1=waitlistRepo.findById(id).orElse(null);
        if(waitlist1 !=null)
        {
            //waitlist1.setUser_id(waitlist.getUser_id());
            //waitlist1.setEvent_id(waitlist.getEvent_id());
            waitlist1.setRequested_at(waitlist.getRequested_at());
            waitlist1.setWaitlist_status(waitlist.getWaitlist_status());
            waitlist1.setPosition(waitlist.getPosition());
            return waitlistRepo.save(waitlist);
        }
        return null;
    }

    public Waitlist delete(Integer id)
    {
        if(waitlistRepo.existsById(id))
        {
            waitlistRepo.deleteById(id);
            return null;
        }
        return null;
    }
}
