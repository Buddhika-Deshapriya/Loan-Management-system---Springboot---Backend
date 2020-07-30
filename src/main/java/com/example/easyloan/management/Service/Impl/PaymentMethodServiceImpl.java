package com.example.easyloan.management.Service.Impl;

import com.example.easyloan.management.Model.PaymentMethod;
import com.example.easyloan.management.Repository.PaymentMethodRepository;
import com.example.easyloan.management.Service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {
    private PaymentMethodRepository paymentMethodRepository;

    @Autowired
    public PaymentMethodServiceImpl(PaymentMethodRepository paymentMethodRepository) {

        this.paymentMethodRepository = paymentMethodRepository;
    }

    @Override
    public List<PaymentMethod> paymentMethodList() {
        return paymentMethodRepository.findAll();
    }

}
