package com.example.easyloan.management.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@NotBlank(message ="First Name is Required")
    // @Size(min=3, max = 50)
    private String firstName;

    private String middleName;

    private  String lastName;

    private String address;

    private Integer nic;

    private Date dob;

    @NaturalId
    //@NotBlank(message ="Email is Required")
    //@Size(max = 50)
    @Email
    @Column(name = "email" , length = 50)
    private String email;

    //@NotBlank(message ="Username is Required")
    //@Size(min=3, max = 50)
    @Column(name = "username" , length = 50)
    private String username;

    //@NotBlank(message ="Password is Required")
    //@Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tbl_user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();



}

