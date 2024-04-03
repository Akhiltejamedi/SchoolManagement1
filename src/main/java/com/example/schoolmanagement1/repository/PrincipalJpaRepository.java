package com.example.schoolmanagement1.repository;
import com.example.schoolmanagement1.model.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipalJpaRepository extends JpaRepository<Principal, Integer> {

}
