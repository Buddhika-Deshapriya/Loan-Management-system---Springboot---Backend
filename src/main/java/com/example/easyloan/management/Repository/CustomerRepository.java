package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public  Customer findByMembership_no(String enteredNumber);
}
