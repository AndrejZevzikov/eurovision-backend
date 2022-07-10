package com.example.eurovision.repositories;

import com.example.eurovision.entities.Contestant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestantRepository extends JpaRepository<Contestant,Long> {
}
