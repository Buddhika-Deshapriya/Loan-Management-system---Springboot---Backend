package com.example.easyloan.management.Controller;

import com.example.easyloan.management.Model.LoanCashRelease;
import com.example.easyloan.management.Service.LoanCashReleaseVoucherIdGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * Controller for loan cash release voucher id generate
 */
@RestController
@RequestMapping("/loancashreleasevoucheridgen")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoanCashReleaseVoucherIdGenController {

    private LoanCashReleaseVoucherIdGenService loanCashReleaseVoucherIdGenService;

    @Autowired
    public LoanCashReleaseVoucherIdGenController(LoanCashReleaseVoucherIdGenService loanCashReleaseVoucherIdGenService) {
        this.loanCashReleaseVoucherIdGenService = loanCashReleaseVoucherIdGenService;
    }

    @RequestMapping("/takeid")
    public List<LoanCashRelease> calcidList(){

        String voucher_id = loanCashReleaseVoucherIdGenService.CashList().get(0).getVoucherNo();
        Integer id = loanCashReleaseVoucherIdGenService.CashList().get(0).getId();
        Integer uid = ++id;
        String final_voucher_id = "LN/COP-"+ uid;
        loanCashReleaseVoucherIdGenService.CashList().get(0).setVoucherNo(final_voucher_id);
        return loanCashReleaseVoucherIdGenService.CashList();
    }
}
