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
@Table(name = "tbl_loan_application_response")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class LoanApplicationResponse {

    //Response of the loan application after applied!
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Manager accepted amount
    @NotNull(message = "Accepted Amount may not be empty")
    @Column(name = "acceptedAmount", length = 30)
    private float acceptedAmount;

    //date field
    @Column(name = "created_date", length = 20)
    private LocalDate createdDate;

    //user field
    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdUser;

    //If the loan approved, pending , released or rejected
    @NotNull(message = "Loan status may not be empty")
    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    //Description of the response
    @NotNull(message = "Description may not be empty")
    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable
    private List<LoanApplication> loanApplications;
}
