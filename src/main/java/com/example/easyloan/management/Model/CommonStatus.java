package com.example.easyloan.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
* Model class of common status
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_common_status")
public class CommonStatus {

    //If the customer active or inactive with the system!
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "type" , length = 20)
    private String type;

}
