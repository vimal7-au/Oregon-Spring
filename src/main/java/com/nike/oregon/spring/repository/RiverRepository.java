package com.nike.oregon.spring.repository;

import com.nike.oregon.spring.entity.River;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
@Service
public interface RiverRepository extends JpaRepository<River, Long> {
    @Async
    Optional<River> findById(Long id);
}
