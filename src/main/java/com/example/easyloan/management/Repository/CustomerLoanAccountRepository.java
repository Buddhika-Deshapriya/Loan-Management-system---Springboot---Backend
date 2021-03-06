package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.CustomerLoanAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for customer loan account
*/
@Repository
public interface CustomerLoanAccountRepository extends JpaRepository<CustomerLoanAccount,Integer> {
}
