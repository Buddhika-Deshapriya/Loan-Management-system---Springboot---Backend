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
* Model class of loan application director response
*/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_loan_application_director_response")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class LoanApplicationDirectorResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //Director accepted amount
    @NotNull(message = "Accepted amount may not be empty")
    @Column(name = "acceptedAmount", length = 30)
    private float acceptedAmount;

    //If the loan approved, pending , released or rejected
    @NotNull(message = "Loan status may not be empty")
    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    //Description of the response
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
    private List<LoanApplication> loanApplicationsList;
}
