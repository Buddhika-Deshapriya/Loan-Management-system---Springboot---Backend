package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
* Model class of membership type
*/
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "tbl_membership_type")
public class MembershipType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type" , length = 20)
    private String type;


}
