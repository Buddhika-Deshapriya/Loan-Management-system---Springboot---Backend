package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.RentalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalTypeRepository extends JpaRepository<RentalType, Integer> {
}
