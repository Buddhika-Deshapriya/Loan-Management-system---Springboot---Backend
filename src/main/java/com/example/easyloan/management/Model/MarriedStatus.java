package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tbl_married_status")
public class MarriedStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int married_status_id;

    @Column(name = "married_status" , length = 20 )
    private String married_status;

}
