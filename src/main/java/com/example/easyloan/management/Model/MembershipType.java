package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tbl_membership_type")
public class MembershipType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int membership_type_id;

    @Column(name = "membership_type" , length = 20)
    private String membership_type;


}
