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
* Model class of payment
*/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_payments")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Account type may not be empty")
    @OneToOne
    @JoinColumn(name = "accountType")
    private AccountType accountType;

    @NotNull(message = "Transaction type may not be empty")
    @OneToOne
    @JoinColumn(name = "transactionType")
    private TransactionType transactionType;

    @NotNull(message = "Payment method may not be empty")
    @OneToOne
    @JoinColumn(name = "paymentMethod")
    private PaymentMethod paymentMethod;

    @ManyToMany(mappedBy = "customerPayment" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Customer> customers;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdUser;

    @Column(name = "created_date", length = 20)
    private LocalDate createdDate;

    @NotNull(message = "Voucher no may not be empty")
    @Column(name = "voucherNo" , length = 30)
    private String voucherNo;

    @NotNull(message = "Amount may not be empty")
    @Column(name = "amount" , length = 30)
    private Float Amount;

    @NotNull(message = "Description may not be empty")
    @Column(name = "description")
    private String description;
}
