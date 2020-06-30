package com.example.easyloan.management.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_customer_assets")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class CustomerAssets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "assetsStatus")
    private CommonStatus assetsStatus;

    @OneToOne
    @JoinColumn(name = "assetsType")
    private CustomerAssetsType assetsType;

    @Column(name = "description")
    private String description;

    @Column(name = "value" , length = 30)
    private float value;

    @ManyToMany
    @JoinTable
    private List<Customer> customers;

}
