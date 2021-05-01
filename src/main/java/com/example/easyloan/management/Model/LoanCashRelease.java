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

/*
* Model class of loan cash release
*/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_loan_cash_release")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class LoanCashRelease  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Voucher no may not be empty")
    @Column(name = "voucherNo" , length = 30)
    private String voucherNo;

    @NotNull(message = "Release amount may not be empty")
    @Column(name = "releaseAmount" , length = 30)
    private Float releaseAmount;

    //If the loan approved, pending , released or rejected
    @NotNull(message = "Loan status may not be empty")
    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    @NotNull(message = "Description may not be empty")
    @Column(name = "description")
    private String description;

    //date field
    @Column(name = "created_date", length = 20)
    private LocalDate createdDate;

    //user field
    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdUser;

    @ManyToMany
    @JoinTable
    private List<LoanApplication> loanApps;



}
