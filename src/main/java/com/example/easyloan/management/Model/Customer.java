package com.example.easyloan.management.Model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_customer")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
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

    @NotEmpty(message = "Required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters long")
    @Column(name = "first_name" , length = 50)
    private String first_name;

    @NotEmpty(message = "Required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters long")
    @Column(name = "middle_name" , length = 50)
    private String middle_name;

//    @NotEmpty(message = "Required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters long")
    @Column(name = "last_name" , length = 50)
    private String last_name;

    @NotNull(message = "Required")
    @Column(name = "dob" , length = 20)
    private Date dob;

    @NotNull(message = "Required")
    @Size(min = 10, max = 12, message = "NIC must be between 10 and 12 characters long")
    @Column(name = "nic" , length = 12)
    private String nic;

    @NotNull(message = "Required")
    @Column(name = "address" , length = 100)
    private String address;

    @NotNull(message = "Required")
//    @Length(min = 10, max = 12, message = "Telephone must be between 10 and 12 characters long")
    @Min(10)
    @Max(12)
    @Column(name = "telephone")
    private Long telephone;

    @NotNull(message = "Required")
//    @Length(min = 10, max = 12, message = "Mobile must be between 10 and 12 characters long")
    @Min(10)
    @Max(12)
    @Column(name = "mobile")
    private Long mobile;

    @Column(name = "email" , length = 60)
    private String email;

    @NotNull(message = "Required")
    //@Min( message = "Required", value =  0)
    @Column(name = "family_income" , length = 30)
    private Float familyIncome;

    @NotNull(message = "Required")
    @Column(name = "total_members" , length = 5)
    private Integer total_members;

    @NotNull(message = "Required")
    //@Min( message = "Required", value =  0)
    @Column(name = "income" , length = 30)
    private Float income;

    @Column(name = "passport" , length = 30)
    private String passport;

    @ManyToMany(mappedBy = "customers")
    public List<LoanApplication> loanApplications;

    @ManyToMany(mappedBy = "customers")
    public List<CustomerAssets> customerAssets;


}
