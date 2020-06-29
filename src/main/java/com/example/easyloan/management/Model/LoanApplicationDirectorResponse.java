package com.example.easyloan.management.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "acceptedAmount", length = 30)
    private float acceptedAmount;

    //If the loan approved, pending , released or rejected
    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    //Description of the response
    @Column(name = "description")
    private String description;

    @Column(name = "authorizedPerson" , length = 30)
    private Integer authorizedPerson;

    @ManyToMany
    @JoinTable
    private List<LoanApplication> loanApplicationsList;
}
