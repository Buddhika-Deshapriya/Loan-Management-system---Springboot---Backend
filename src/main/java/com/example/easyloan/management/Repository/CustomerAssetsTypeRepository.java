package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.CustomerAssetsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for customer assets
*/
@Repository
public interface CustomerAssetsTypeRepository extends JpaRepository<CustomerAssetsType, Integer> {
}
