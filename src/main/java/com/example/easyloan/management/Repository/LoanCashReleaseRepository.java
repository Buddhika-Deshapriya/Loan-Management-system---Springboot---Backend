package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanCashRelease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanCashReleaseRepository extends JpaRepository<LoanCashRelease,Integer> {

    @Query(value="SELECT *  FROM tbl_loan_cash_release ORDER BY id DESC LIMIT 1", nativeQuery = true)
    List<LoanCashRelease> findLastQuery();
}
