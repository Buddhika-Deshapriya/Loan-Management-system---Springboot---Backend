package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Payment;
import com.example.easyloan.management.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/*
 * Controller for payment
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @RequestMapping("/add")
    public Payment addPayment(@RequestBody @Valid Payment payment) throws Exception {
        return paymentService.addPayment(payment);
    }

    @RequestMapping("/list/{id}")
    public Optional<Payment> findById(@PathVariable Integer id){
        return paymentService.findById(id);
    }

    @RequestMapping("/list")
    public List<Payment> paymentList(){
        return paymentService.paymentList();

    }

    @RequestMapping("/delete/{id}")
    public String deletePayment(@PathVariable Integer id) {
        return paymentService.deletePayment(id);
    }
}
