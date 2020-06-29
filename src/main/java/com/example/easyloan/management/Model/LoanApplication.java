package com.example.easyloan.management.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_loan_application")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //rental type of the loan (monthly, annually, quarter)!
    @OneToOne
    @JoinColumn(name = "rentalTypeId")
    private RentalType rentalTypeId;

    //loan type of the loan (mid term, long term, etc)!
    @OneToOne
    @JoinColumn(name = "loanTypeId")
    private LoanType loanTypeId;

//    @OneToOne
//    @JoinColumn(name = "loanStatusId")
//    private LoanStatus loanStatusId;

    private String applicationNo;

    private String calculationNo;

    @OneToOne(cascade = CascadeType.ALL)
    private LoanApplicationResponse loanApplicationResponse;





    @Column(name = "loanAmount" , length = 30)
    private float loanAmount;

    @Column(name = "effectiveRate" , length = 10)
    private float effectiveRate;

    @Column(name = "noOfRentals" , length = 10)
    private Integer noOfRentals;

    @Column(name = "paymentPeriod" , length = 10)
    private Integer paymentPeriod;

    @Column(name = "otherCharges" , length = 30)
    private float otherCharges;

    @Column(name = "description" , length = 150)
    private String description;

    @Column(name = "createdDate" , length = 30)
    private Date createdDate;

    @ManyToMany
    @JoinTable
    private List<Customer> customers;

    //Rajitha
    @ManyToMany(mappedBy = "loanApplications")
    public List<LoanApplicationResponse> loanApplicationResponses;

    @ManyToMany(mappedBy = "loanApplicationsList")
    public List<LoanApplicationDirectorResponse> loanApplicationDirectorResponses;
}
