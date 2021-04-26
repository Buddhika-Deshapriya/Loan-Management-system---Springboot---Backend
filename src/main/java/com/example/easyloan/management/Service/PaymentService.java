package com.example.easyloan.management.Service;

import com.example.easyloan.management.Model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    List<Payment> paymentList();

    Optional<Payment> findById(Integer id);

    Payment addPayment(Payment payment);

    String deletePayment(Integer id);
}
