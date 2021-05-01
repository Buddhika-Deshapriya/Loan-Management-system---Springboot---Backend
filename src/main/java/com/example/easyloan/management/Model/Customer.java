package com.example.easyloan.management.Model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

/*
* Model class of customer
*/
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
    @NotNull(message = "Gender may not be empty")
    @OneToOne
    @JoinColumn(name = "gender")
    private Gender gender;

    //Title of the customer from title table!
    @NotNull(message = "Title may not be empty")
    @OneToOne
    @JoinColumn(name = "title")
    private Title title;

    //Membership type of the customer from membership type table!
    @NotNull(message = "Membership type may not be empty")
    @OneToOne
    @JoinColumn(name = "membershipType")
    private MembershipType membershipType;

    //Family type of the customer from family type table!
    @NotNull(message = "Family type may not be empty")
    @OneToOne
    @JoinColumn(name = "familyType")
    private FamilyType familyType;

    //If the customer is working or no longer working with the system!
    @NotNull(message = "Common status may not be empty")
    @OneToOne
    @JoinColumn(name = "customerStatus")
    private CommonStatus customerStatus;

    //Mariel status of the customer from married status table!
    @NotNull(message = "Married status may not be empty")
    @OneToOne
    @JoinColumn(name = "marriedStatus")
    private MarriedStatus marriedStatus;

    @NotNull(message = "Membership number may not be empty")
    @Column(name = "membership_no" , length = 50)
    private String membership_no;

    @NotEmpty(message = "First name may not be empty")
//    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters long")
    @Column(name = "first_name" , length = 50)
    private String first_name;

    @NotEmpty(message = "Middle name may not be empty")
//    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters long")
    @Column(name = "middle_name" , length = 50)
    private String middle_name;

    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters long")
    @Column(name = "last_name" , length = 50)
    private String last_name;

    @NotNull(message = "Date of birth may not be empty")
//    @Future(message = "Date of birth may not be future value")
    @Column(name = "dob" , length = 20)
    private LocalDate dob;

    @NotNull(message = "NIC may not be empty")
//    @Size(min = 10, max = 10, message = "NIC must be between 10 and 12 characters long")
//    @Pattern(regexp = "^[0-9]{9}[vV]$" , message = "NIC must be 10 characters long")
    @Column(name = "nic" , length = 12)
    private String nic;

    @NotNull(message = "Address may not be empty")
    @Column(name = "address" , length = 100)
    private String address;

    @NotBlank(message = "Telephone may not be empty")
    @Pattern(regexp="(^$|[0-9]{10})" , message = "Telephone number must be 10 characters long")
//    @Range(min = 10, max = 11, message = "Telephone must be 10 characters long")
//    @Min( value=10 , message = "Telephone must be between 10 and 12 characters long")
//    @Max( value = 10 , message = "Telephone must be between 10 and 12 characters long")
    @Column(name = "telephone" , length = 11)
    private String telephone;

    @NotBlank(message = "Mobile may not be empty")
    @Pattern(regexp="(^$|[0-9]{10})" , message = "Mobile number must be 10 characters long")
//    @Range(min = 9, max = 11, message = "Mobile must be 10 characters long")
//    @Min(value=10 , message = "Mobile must be between 10 and 12 characters long")
//    @Max( value = 10 , message = "Mobile must be between 10 and 12 characters long")
    @Column(name = "mobile" , length = 11)
    private String mobile;

    @Column(name = "email" , length = 60)
    @Size(max = 60)
    @Email
    private String email;

    @NotNull(message = "Family income may not be empty")
    @Column(name = "family_income" , length = 30)
    private Float familyIncome;

    @NotNull(message = "Total members may not be empty")
    @Column(name = "total_members" , length = 10)
    private String total_members;

    @NotNull(message = "Income may not be empty")
    @Column(name = "income" , length = 30)
    private Float income;

    @Column(name = "passport" , length = 30)
    private String passport;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdUser;

    @Column(name = "created_date", length = 20)
    private LocalDate createdDate;

    @JsonIgnore
    @ManyToMany(mappedBy = "customers")
    public List<LoanApplication> loanApplications;

    @ManyToMany(mappedBy = "customers")
    public List<CustomerAssets> customerAssets;

    @ManyToMany
    @JoinTable
    private List<Payment> customerPayment;
}
