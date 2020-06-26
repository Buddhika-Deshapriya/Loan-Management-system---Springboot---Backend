//package com.example.easyloan.management.Model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@ToString
//@Entity
//@Table(name = "tbl_loan")
//public class Loan {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
////    @OneToOne
////    @JoinColumn(name = "customerId")
////    private Customer customerId;
////
////    @OneToOne
////    @JoinColumn(name = "loanTypeId")
////    private LoanType loanTypeId;
////
////    @OneToOne
////    @JoinColumn(name = "rentalTypeId")
////    private RentalType rentalTypeId;
////
////    @OneToOne
////    @JoinColumn(name = "paymentMethodId")
////    private PaymentMethod paymentMethodId;
////
////    @OneToOne
////    @JoinColumn(name = "loanApplicationId")
////    private LoanApplication loanApplicationId;
////
////    @OneToOne
////    @JoinColumn(name = "calculationNo")
////    private LoanApplication calculationNo;
////
////    @OneToOne
////    @JoinColumn(name = "membershipNo")
////    private Customer membershipNo;
////
////    @OneToOne
////    @JoinColumn(name = "status")
////    private LoanStatus status;
//
//    @Column(name = "description")
//    private String description;
//
//    @Column(name = "amount" , length = 30)
//    private float amount;
//
//    @Column(name = "noOfRentals" , length = 5)
//    private Integer noOfRentals;
//
//    @Column(name = "interestRate" , length = 10)
//    private float interestRate;
//
//    @Column(name = "createdDate" , length = 30)
//    private Date createdDate;
//
//}
