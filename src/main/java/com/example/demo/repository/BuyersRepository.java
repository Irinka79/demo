package com.example.demo.repository;
import com.example.demo.model.Buyers;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BuyersRepository extends JpaRepository<Buyers, Integer> {
}

