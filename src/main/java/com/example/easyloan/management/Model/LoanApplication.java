package com.example.easyloan.management.Model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

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
    @NotNull(message = "Rental type may not be empty")
    @OneToOne
    @JoinColumn(name = "rentalTypeId")
    private RentalType rentalTypeId;

    //loan type of the loan (mid term, long term, etc)!
    @NotNull(message = "Loan type may not be empty")
    @OneToOne
    @JoinColumn(name = "loanTypeId")
    private LoanType loanTypeId;

//    @OneToOne
//    @JoinColumn(name = "loanStatusId")
//    private LoanStatus loanStatusId;

    private String applicationNo;

    private String calculationNo;

    @NotNull(message = "Loan amount may not be empty")
    @Column(name = "loanAmount" , length = 30)
    private float loanAmount;

    @NotNull(message = "Effective rate may not be empty")
    @Column(name = "effectiveRate" , length = 10)
    private float effectiveRate;

    @NotNull(message = "No of rentals may not be empty")
    @Column(name = "noOfRentals" , length = 10)
    private Integer noOfRentals;

    @NotNull(message = "Payment period may not be empty")
    @Column(name = "paymentPeriod" , length = 10)
    private Integer paymentPeriod;

    @NotNull(message = "Other charges may not be empty")
    @Column(name = "otherCharges" , length = 30)
    private float otherCharges;

    @Column(name = "description" , length = 150)
    private String description;

    @NotNull(message = "Create date may not be empty")
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


    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    @ManyToMany(mappedBy = "loanApps")
    public List<LoanCashRelease> loanCashReleases;


}
