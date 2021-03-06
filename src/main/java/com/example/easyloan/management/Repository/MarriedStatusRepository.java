package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.MarriedStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for married status
*/
@Repository
public interface MarriedStatusRepository extends JpaRepository<MarriedStatus, Integer> {
}
