package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
* Model class of customer loan account
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_customer_loan_account")
public class CustomerLoanAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "voucherNo" , length = 30)
    private String voucherNo;

    @Column(name = "interestRate" , length = 5)
    private float interestRate;

    @Column(name = "credit" , length = 30)
    private float credit;

    @Column(name = "debit" , length = 30)
    private float debit;

    @Column(name = "balance" , length = 30)
    private float balance;

    @Column(name = "description")
    private String description;


}
