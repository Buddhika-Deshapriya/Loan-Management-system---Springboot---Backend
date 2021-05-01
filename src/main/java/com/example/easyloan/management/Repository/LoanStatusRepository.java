package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for loan status
*/
@Repository
public interface LoanStatusRepository extends JpaRepository<LoanStatus, Integer> {
}
