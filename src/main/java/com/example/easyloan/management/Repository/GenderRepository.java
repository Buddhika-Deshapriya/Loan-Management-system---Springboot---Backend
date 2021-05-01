package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for gender
*/
@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer> {
}
