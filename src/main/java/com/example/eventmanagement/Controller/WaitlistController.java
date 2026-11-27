package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Payments;
import com.example.eventmanagement.Entity.Waitlist;
import com.example.eventmanagement.Service.PaymentsService;
import com.example.eventmanagement.Service.WaitlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/waitlist")
public class WaitlistController {
    @Autowired
    WaitlistService waitlistService;

    @PostMapping("/insert")
    public Waitlist insert(@RequestBody Waitlist waitlist)
    {
        return waitlistService.insert(waitlist);
    }

    @PostMapping("/insertmany")
    public List<Waitlist> insertmany(@RequestBody List<Waitlist> waitlists)
    {
        return waitlistService.insertmany(waitlists);
    }

    @GetMapping("/fetch")
    public List<Waitlist> fetch()
    {
        return waitlistService.fetch();
    }

    @GetMapping("/fetch/{id}")
    public Waitlist fetchbyid(@PathVariable Integer id)
    {
        return waitlistService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
        public Waitlist update(@PathVariable Integer id,@RequestBody Waitlist waitlist)
    {
        return waitlistService.update(id,waitlist);
    }

    @DeleteMapping("/delete/{id}")
    public Waitlist delete(@PathVariable Integer id)
    {
        return waitlistService.delete(id);
    }
}
