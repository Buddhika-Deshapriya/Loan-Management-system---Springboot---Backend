package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToOne
    @JoinColumn(name = "status")
    private LoanStatus status;

    @Column(name = "description")
    private String description;

    @Column(name = "amount" , length = 30)
    private float authorizedAmount;

    @Column(name = "createdDate" , length = 30)
    private Date createdDate;

    //user field


}
