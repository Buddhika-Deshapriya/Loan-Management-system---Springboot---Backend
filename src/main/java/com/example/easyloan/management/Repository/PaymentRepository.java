package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    @Query(value="SELECT *  FROM tbl_payments ORDER BY id DESC LIMIT 1", nativeQuery = true)
    List<Payment> findLastQuery();
}
