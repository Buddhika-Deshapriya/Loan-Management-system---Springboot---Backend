package com.example.easyloan.management.Model;

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
public class LoanApplicationResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "acceptedAmount", length = 30)
    private float acceptedAmount;



    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    @Column(name = "description")
    private String description;
}
