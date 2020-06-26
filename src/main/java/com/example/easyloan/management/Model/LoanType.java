package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_loan_type")
public class LoanType {

    //Loan types witch are can apply to loans!
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //If the loan type active or inactive!
    @OneToOne
    @JoinColumn(name = "status_id")
    private CommonStatus status;

    @Column(name = "loan_type" , length = 30)
    private String loanType;

    @Column(name = "description" , length = 150)
    private String description;

    @Column(name = "min_amount" , length = 30)
    private float minAmount;

    @Column(name = "max_amount" , length = 30)
    private float maxAmount;

    @Column(name = "min_interest_rate" , length = 10)
    private float minInterestRate;

    @Column(name = "max_interest_rate" , length = 10)
    private float maxInterestRate;

    @Column(name = "min_time_period" , length = 20)
    private String minTimePeriod;

    @Column(name = "max_time_period" , length = 20)
    private String maxTimePeriod;

}
