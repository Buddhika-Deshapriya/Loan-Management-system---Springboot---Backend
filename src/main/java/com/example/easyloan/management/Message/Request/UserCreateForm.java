package com.example.easyloan.management.Message.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserCreateForm {

    //@NotBlank(message ="Full Name is Required")
    //@Size(min = 3, max = 50)
    private String firstName;

    private String middleName;

    private  String lastName;

    private String address;

    private Integer nic;

    private Date dob;

    //@NotBlank(message ="User Name is Required")
    //@Size(min = 3, max = 50)
    private String username;

    //@NotBlank(message ="Email is Required")
    //@Size(max = 60)
    @Email
    private String email;

    private Set<String> role;

    //@NotBlank(message ="Password is Required")
    //@Size(min = 6, max = 40)
    private String password;


}