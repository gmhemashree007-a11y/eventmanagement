package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Event_Seats;
import com.example.eventmanagement.Entity.Payments;
import com.example.eventmanagement.Service.Event_SeatsService;
import com.example.eventmanagement.Service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
    @Autowired
    PaymentsService paymentsService;

    @PostMapping("/insert")
    public Payments insert(@RequestBody Payments payments)
    {
        return paymentsService.insert(payments);
    }

    @PostMapping("/insertmany")
    public List<Payments> insertmany(@RequestBody List<Payments> payments)
    {
        return paymentsService.insertmany(payments);
    }

    @GetMapping("/fetch")
    public List<Payments> fetch()
    {
        return paymentsService.fetch();
    }

    @GetMapping("/fetch/{id}")
    public Payments fetchbyid(@PathVariable Integer id)
    {
        return paymentsService.fetchbyid(id);
    }

    @PutMapping("/update/{id}")
    public Payments update(@PathVariable Integer id,@RequestBody Payments payments)
    {
        return paymentsService.update(id,payments);
    }

    @DeleteMapping("/delete/{id}")
    public Payments delete(@PathVariable Integer id)
    {
        return paymentsService.delete(id);
    }
}
