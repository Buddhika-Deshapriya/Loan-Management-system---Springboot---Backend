package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.CustomerSavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSavingAccountRepository extends JpaRepository<CustomerSavingAccount,Integer> {
}
