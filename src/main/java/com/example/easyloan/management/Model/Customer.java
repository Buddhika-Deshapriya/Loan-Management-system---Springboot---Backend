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

    //Gender of the customer from gender table!
    @OneToOne
    @JoinColumn(name = "gender")
    private Gender gender;

    //Title of the customer from title table!
    @OneToOne
    @JoinColumn(name = "title")
    private Title title;

    //Membership type of the customer from membership type table!
    @OneToOne
    @JoinColumn(name = "membershipType")
    private MembershipType membershipType;

    //Family type of the customer from family type table!
    @OneToOne
    @JoinColumn(name = "familyType")
    private FamilyType familyType;

    //If the customer is working or no longer working with the system!
    @OneToOne
    @JoinColumn(name = "customerStatus")
    private CommonStatus customerStatus;

    //Mariel status of the customer from married status table!
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
