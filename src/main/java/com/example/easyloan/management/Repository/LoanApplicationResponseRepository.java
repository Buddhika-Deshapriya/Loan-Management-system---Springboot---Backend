package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanApplicationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationResponseRepository extends JpaRepository<LoanApplicationResponse,Integer> {
}
