package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_customer_saving_account")
public class CustomerSavingAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "voucherNo" , length = 30)
    private String voucherNo;

    @Column(name = "credit" , length = 30)
    private float credit;

    @Column(name = "debit" , length = 30)
    private float debit;

    @Column(name = "balance" , length = 30)
    private float balance;

    @Column(name = "description")
    private String description;
}