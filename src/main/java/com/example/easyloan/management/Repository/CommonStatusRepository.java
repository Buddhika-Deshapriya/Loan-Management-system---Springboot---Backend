package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.CommonStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for common status
*/
@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatus, Integer> {
}
