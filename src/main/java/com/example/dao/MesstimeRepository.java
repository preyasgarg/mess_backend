package com.example.dao;

import com.example.model.Messtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesstimeRepository extends JpaRepository<Messtime, Integer> {


}
