package com.example.easyloan.management.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "gender")
    private Gender gender;

    @OneToOne
    @JoinColumn(name = "title")
    private Title title;

    @OneToOne
    @JoinColumn(name = "membershipType")
    private MembershipType membershipType;

    @OneToOne
    @JoinColumn(name = "familyType")
    private FamilyType familyType;

    @OneToOne
    @JoinColumn(name = "customerStatus")
    private CustomerStatus customerStatus;

    @OneToOne
    @JoinColumn(name = "marriedStatus")
    private MarriedStatus marriedStatus;

    @Column(name = "membership_no" , length = 50)
    private String membership_no;

    @Column(name = "first_name" , length = 50)
    private String first_name;

    @Column(name = "middle_name" , length = 50)
    private String middle_name;

    @Column(name = "last_name" , length = 50)
    private String last_name;

    @Column(name = "dob" , length = 20)
    private Date dob;

    @Column(name = "nic" , length = 15)
    private String nic;

    @Column(name = "address" , length = 100)
    private String address;

    @Column(name = "telephone" , length = 15)
    private int telephone;

    @Column(name = "mobile" , length = 15)
    private int mobile;

    @Column(name = "email" , length = 50)
    private String email;

    @Column(name = "family_income" , length = 30)
    private float familyIncome;

    @Column(name = "total_members" , length = 5)
    private int total_members;

    @Column(name = "income" , length = 30)
    private float income;

    @Column(name = "passport" , length = 30)
    private String passport;


}
