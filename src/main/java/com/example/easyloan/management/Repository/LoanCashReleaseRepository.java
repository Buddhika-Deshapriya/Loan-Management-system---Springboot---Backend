package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanCashRelease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanCashReleaseRepository extends JpaRepository<LoanCashRelease,Integer> {
}
