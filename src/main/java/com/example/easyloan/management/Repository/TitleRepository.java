package com.example.easyloan.management.Repository;

import com.example.easyloan.management.Model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Repository interface for title
*/
@Repository
public interface TitleRepository extends JpaRepository<Title, Integer> {
}
