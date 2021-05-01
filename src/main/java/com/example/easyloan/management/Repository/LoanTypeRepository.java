package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for loan type
*/
@Repository
public interface LoanTypeRepository extends JpaRepository<LoanType, Integer> {

}
