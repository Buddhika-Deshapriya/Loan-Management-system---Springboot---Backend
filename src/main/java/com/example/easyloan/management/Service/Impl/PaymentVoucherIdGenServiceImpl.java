package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.Payment;
import com.example.easyloan.management.Repository.PaymentRepository;
import com.example.easyloan.management.Service.PaymentVoucherIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentVoucherIdGenServiceImpl implements PaymentVoucherIdGenService {
    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentVoucherIdGenServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<Payment> VoucherList() {
        return paymentRepository.findLastQuery();
    }
}
