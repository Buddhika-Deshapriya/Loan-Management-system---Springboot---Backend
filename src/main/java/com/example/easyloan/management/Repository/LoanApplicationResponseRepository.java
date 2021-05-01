package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanApplicationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*
* Repository interface of loan application response
*/
@Repository
public interface LoanApplicationResponseRepository extends JpaRepository<LoanApplicationResponse,Integer> {
}
