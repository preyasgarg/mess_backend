package com.example.dao;


import com.example.model.Logintable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogintableRepository extends JpaRepository<Logintable, Integer> {


}
