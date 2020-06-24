package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.*;


@Entity
@Table(name = "tbl_customer_status")
public class CustomerStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int status_id;

    @Column(name = "status" , length = 20)
    private String status;
}
