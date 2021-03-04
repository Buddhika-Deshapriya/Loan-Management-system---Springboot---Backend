package com.example.easyloan.management.Model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
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
    @JoinColumn(name = "rental_type_id")
    private RentalType rentalTypeId;

    //loan type of the loan (mid term, long term, etc)!
    @NotNull(message = "Loan type may not be empty")
    @OneToOne
    @JoinColumn(name = "loanTypeId")
    private LoanType loanTypeId;

    @NotNull(message = "Loan status may not be empty")
    @OneToOne
    @JoinColumn(name = "loanStatus")
    private LoanStatus loanStatus;

    @NotNull(message = "Branch may not be empty")
    @OneToOne
    @JoinColumn(name = "branch")
    private Branch branch;

    @NotNull(message = "Application no may not be empty")
    private String applicationNo;

    @NotNull(message = "Calculation no may not be empty")
    private String calculationNo;

    @NotNull(message = "Loan amount may not be empty")
    @Column(name = "loanAmount" , length = 30)
    private Float loanAmount;

    @NotNull(message = "Effective rate may not be empty")
    @Column(name = "effectiveRate" , length = 10)
    private Float effectiveRate;

    @NotNull(message = "No of rentals may not be empty")
    @Column(name = "noOfRentals" , length = 10)
    private Integer noOfRentals;

    @NotNull(message = "Payment period may not be empty")
    @Column(name = "paymentPeriod" , length = 10)
    private Integer paymentPeriod;

    @NotNull(message = "Other charges may not be empty")
    @Column(name = "otherCharges" , length = 30)
    private Float otherCharges;

    @NotNull(message = "Description may not be empty")
    @Column(name = "description" , length = 150)
    private String description;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdUser;

    @Column(name = "created_date", length = 20)
    private LocalDate createdDate;

    //@JsonBackReference
    @ManyToMany
    @JoinTable
    private List<Customer> customers;



    @ManyToMany(mappedBy = "loanApplications")
    public List<LoanApplicationResponse> loanApplicationResponses;

    @ManyToMany(mappedBy = "loanApplicationsList")
    public List<LoanApplicationDirectorResponse> loanApplicationDirectorResponses;

    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    @ManyToMany(mappedBy = "loanApps")
    public List<LoanCashRelease> loanCashReleases;

}
