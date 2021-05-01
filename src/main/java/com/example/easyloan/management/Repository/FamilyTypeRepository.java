package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.FamilyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for family type
*/
@Repository
public interface FamilyTypeRepository extends JpaRepository<FamilyType,Integer> {
}
