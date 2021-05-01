package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for account type
*/
@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType,Integer> {
}
