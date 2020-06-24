package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tbl_family_type")
public class FamilyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int family_type_id;

    @Column(name = "family_type" , length = 10)
    private String family_type;

}
