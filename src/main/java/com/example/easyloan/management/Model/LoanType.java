package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_loan_type")
public class LoanType {

    //Loan types witch are can apply to loans!
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //If the loan type active or inactive!
    @NotNull(message = "Status may not be empty")
    @OneToOne
    @JoinColumn(name = "status_id")
    private CommonStatus status;

    @NotEmpty(message = "Loan type may not be empty")
    @Column(name = "loan_type" , length = 30)
    private String loanType;

    @NotNull(message = "Description may not be empty")
    @Column(name = "description" , length = 150)
    private String description;

    @NotNull(message = "Minimum amount may not be empty")
    @Column(name = "min_amount" , length = 30)
    private Float minAmount;

    @NotNull(message = "Maximum amount may not be empty")
    @Column(name = "max_amount" , length = 30)
    private Float maxAmount;

    @NotNull(message = "Minimum interest may not be empty")
    @Column(name = "min_interest_rate" , length = 10)
    private Float minInterestRate;

    @NotNull(message = "Maximum interest may not be empty")
    @Column(name = "max_interest_rate" , length = 10)
    private Float maxInterestRate;

    @NotNull(message = "Minimum time period may not be empty")
    @Column(name = "min_time_period" , length = 20)
    private Integer minTimePeriod;

    @NotNull(message = "Maximum time period may not be empty")
    @Column(name = "max_time_period" , length = 20)
    private Integer maxTimePeriod;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdUser;

    @Column(name = "created_date", length = 20)
    private LocalDate createdDate;

}
