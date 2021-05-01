package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
* Model class of family type
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_family_type")
public class FamilyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type" , length = 10)
    private String type;
}
