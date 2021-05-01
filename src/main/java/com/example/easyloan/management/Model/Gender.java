package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
* Model class of gender
*/
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "tbl_gender")
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type" , length = 15)
    private String type;



}
