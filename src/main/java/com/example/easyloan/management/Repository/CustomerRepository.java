package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value="SELECT *  FROM tbl_customer ORDER BY id DESC LIMIT 1", nativeQuery = true)
    List<Customer> findLastQuery();
}
