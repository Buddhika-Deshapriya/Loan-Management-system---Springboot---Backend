package com.example.easyloan.management.Model;

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
@Table(name = "tbl_loan_application_response")
public class LoanApplicationResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "acceptedAmount", length = 30)
    private float acceptedAmount;

//    @OneToOne
//    @JoinColumn(name = "loanApplicationId")
//    private LoanApplication loanApplication;

//    @OneToMany(targetEntity = LoanApplicationResponse.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "loanApplicationId" ,updatable = false)
//    private List<LoanApplication> loanApplication;

    @OneToOne
    @JoinColumn(name = "loanStatusId")
    private LoanStatus loanStatus;

    @Column(name = "description")
    private String description;
}
