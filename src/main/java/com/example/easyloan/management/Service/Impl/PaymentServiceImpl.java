package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Payment;
import com.example.easyloan.management.Repository.PaymentRepository;
import com.example.easyloan.management.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Service implementation for payment service
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    private PaymentRepository paymentRepository;

    @Autowired
    public  PaymentServiceImpl(PaymentRepository paymentRepository) {

        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<Payment> paymentList() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payment> findById(Integer id) {
        return paymentRepository.findById(id);
    }

    @Override
    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);

    }

    @Override
    public String deletePayment(Integer id) {
        paymentRepository.deleteById(id);
        return "{'Message' : 'Payment Deleted Successfully!'}";
    }
}
