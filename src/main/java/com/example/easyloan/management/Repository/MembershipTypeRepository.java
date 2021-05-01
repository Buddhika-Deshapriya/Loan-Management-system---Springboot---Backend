package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.MembershipType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface membership type
*/
@Repository
public interface MembershipTypeRepository extends JpaRepository<MembershipType, Integer> {
}
