package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.Payment;
import com.example.easyloan.management.Service.PaymentVoucherIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/paymentvoucherid")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PaymentVoucherIdGenController {
    private PaymentVoucherIdGenService paymentVoucherIdGenService;

    @Autowired
    public PaymentVoucherIdGenController(PaymentVoucherIdGenService paymentVoucherIdGenService) {
        this.paymentVoucherIdGenService = paymentVoucherIdGenService;
    }

    @RequestMapping("/takeid")
    public List<Payment> voucheridList(){

//        String app_id = paymentVoucherIdGenService.VoucherList().get(0).getVoucherNo();
//        String calc_id = paymentVoucherIdGenService.VoucherList().get(0).get();
        LocalDate localDate = LocalDate.now();
        Integer id = paymentVoucherIdGenService.VoucherList().get(0).getId();
        Integer uid = ++id;
        String final_voucher_id = "TR-" + localDate + "-" + uid;
        paymentVoucherIdGenService.VoucherList().get(0).setVoucherNo(final_voucher_id);
        return paymentVoucherIdGenService.VoucherList();
    }
}
