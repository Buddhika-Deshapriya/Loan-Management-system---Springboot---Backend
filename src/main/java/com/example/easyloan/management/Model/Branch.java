package com.example.easyloan.management.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/*
* Model class of branch
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_branch")
@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Branch code may not be empty")
    @Column(name = "branchCode" , length = 100)
    public String branchCode;

    @NotNull(message = "Branch name may not be empty")
    @Column(name = "branchName", length = 200)
    public String branchName;

    @NotNull(message = "Branch Address may not be empty")
    @Column(name = "branchAddress")
    public String branchAddress;

    @NotNull(message = "Branch status may not be empty")
    @OneToOne
    @JoinColumn(name = "branchStatus")
    public CommonStatus branchStatus;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User createdUser;

    @Column(name = "created_date", length = 20)
    private LocalDate createdDate;
}
