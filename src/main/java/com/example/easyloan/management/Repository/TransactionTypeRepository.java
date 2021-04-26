package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypeRepository extends JpaRepository<TransactionType,Integer> {
}
