package com.example.schoolmanagement1.repository;

import com.example.schoolmanagement1.model.Logindetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogindetailsJpaRepository extends JpaRepository<Logindetails,Integer> {
   Logindetails findByEmail(String email);
}
