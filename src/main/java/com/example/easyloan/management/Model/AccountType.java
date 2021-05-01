package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/*
* Model class of account type
*/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_account_type")
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type" , length = 20)
    private String type;
}
