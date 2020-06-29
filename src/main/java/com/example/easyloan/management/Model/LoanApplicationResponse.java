package com.example.easyloan.management.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Column(name = "acceptedAmount", length = 30)
    private float acceptedAmount;

    //If the loan approved, pending , released or rejected
    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    //Description of the response
    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable
    private List<LoanApplication> loanApplications;
}
