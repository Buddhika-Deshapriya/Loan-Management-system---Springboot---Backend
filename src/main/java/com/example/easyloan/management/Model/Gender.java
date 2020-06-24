package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tbl_gender")
public class Gender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gender_id;

    @Column(name = "gender_type" , length = 15)
    private String gender_type;

}
