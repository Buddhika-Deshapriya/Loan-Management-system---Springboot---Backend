package com.example.easyloan.management.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_loan_application")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "rentalTypeId")
    private RentalType rentalTypeId;

    @OneToOne
    @JoinColumn(name = "loanTypeId")
    private LoanType loanTypeId;

    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatusId;

    private String applicationNo;

    private String calculationNo;

//    @Column(name = "membershipNo" , length = 50)
//    private String membershipNo;
   @ManyToMany(fetch = FetchType.LAZY)
   @JoinTable(
           name = "tbl_customer_loan_application",
           joinColumns = @JoinColumn( name  ="application_id"),
           inverseJoinColumns = @JoinColumn(name ="customer_id"))
   private Set<Customer> customers = new HashSet<>();



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

    @Column(name = "createdDate" , length = 20)
    private Date createdDate;

}
