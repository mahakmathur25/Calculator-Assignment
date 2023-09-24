package com.calculator.demo.Repository;

import com.calculator.demo.Entity.CalculatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends JpaRepository<CalculatorEntity, Long> {
}
