package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.LoanApplicationDirectorResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for loan application director response
*/
@Repository
public interface LoanApplicationDirectorResponseRepository extends JpaRepository<LoanApplicationDirectorResponse,Integer> {
}
