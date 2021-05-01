package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
* Repository interface for branch
*/
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {
    @Query(value="SELECT *  FROM tbl_branch ORDER BY id DESC LIMIT 1", nativeQuery = true)
    List<Branch> findLastQuery();
}
