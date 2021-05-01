package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
Repository interface loan application for customer
*/
@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {

    @Query(value="SELECT *  FROM tbl_loan_application ORDER BY id DESC LIMIT 1", nativeQuery = true)
    List<LoanApplication> findLastQuery();
}
