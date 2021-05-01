package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.PaymentMethod;
import com.example.easyloan.management.Service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for payment method
 */
@RestController
@RequestMapping("/paymentmethod")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PaymentMethodController {
    private PaymentMethodService paymentMethodService;

    @Autowired
    public PaymentMethodController(PaymentMethodService paymentMethodService){
        this.paymentMethodService = paymentMethodService;
    }
    @RequestMapping("/list")
    public List<PaymentMethod> paymentMethodList(){
        return paymentMethodService.paymentMethodList();
    }
}
