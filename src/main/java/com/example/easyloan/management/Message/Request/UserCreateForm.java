package com.example.easyloan.management.Message.Request;

import com.example.easyloan.management.Validation.Constraint.NicNumberConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserCreateForm {

    @NotBlank(message ="First Name is Required")
    @Size(min = 3, max = 50)
    private String firstName;

    @NotBlank(message ="Middle Name is Required")
    @Size(min = 3, max = 50)
    private String middleName;

    private  String lastName;

    @NotBlank(message = "Address is Required")
    private String address;

    @NotBlank(message = "Mobile is Required")
    @Pattern(regexp="(^$|[0-9]{10})" , message = "Telephone number must be 10 characters long")
    private String mobile;

    @NotBlank(message = "NIC is Required")
    @NicNumberConstraint
    private Integer nic;

    @NotBlank(message = "DOB is Required")
    private LocalDate dob;

    @NotBlank(message ="User Name is Required")
    @Size(min = 3, max = 50)
    private String username;

    @NotBlank(message ="Email is Required")
    @Size(max = 60)
    @Email
    private String email;

    private Set<String> role;

    @NotBlank(message ="Password is Required")
    @Size(min = 6, max = 40)
    private String password;


}