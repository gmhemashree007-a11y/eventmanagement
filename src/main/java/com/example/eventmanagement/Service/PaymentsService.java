package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Event_Seats;
import com.example.eventmanagement.Entity.Payments;
import com.example.eventmanagement.Repository.Event_SeatsRepo;
import com.example.eventmanagement.Repository.PaymentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentsService {
    @Autowired
    PaymentsRepo paymentsRepo;

    public Payments insert(Payments payments)
    {
        return paymentsRepo.save(payments);
    }

    public List<Payments> insertmany(List<Payments> payments)
    {
        return paymentsRepo.saveAll(payments);
    }

    public List<Payments> fetch()
    {
        return paymentsRepo.findAll();
    }

    public Payments fetchbyid(Integer id)
    {
        return paymentsRepo.findById(id).orElse(null);
    }

    public Payments update(Integer id, Payments payments)
    {
        Payments payments1=paymentsRepo.findById(id).orElse(null);
        if(payments1 !=null)
        {
            //payments1.setBooking_id(payments.getBooking_id());
            payments1.setAmount(payments.getAmount());
            payments1.setPayment_method(payments.getPayment_method());
            payments1.setPayment_status(payments.getPayment_status());
            payments1.setTransaction_id(payments.getTransaction_id());
            payments1.setPayment_date(payments.getPayment_date());
            return paymentsRepo.save(payments1);
        }
        return null;
    }

    public Payments delete(Integer id)
    {
        if(paymentsRepo.existsById(id))
        {
            paymentsRepo.deleteById(id);
            return null;
        }
        return null;
    }
}
