package com.example.dao;


import com.example.model.Registration;
import com.example.model.Studentdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentdetailsRepository extends JpaRepository<Studentdetails, Integer> {

    @Query(
            value="SELECT * FROM studentdetails e WHERE e.email=?1",
            nativeQuery = true
    )
    public Studentdetails findByEmail(String email);

    @Query(
            value="SELECT * FROM studentdetails e WHERE e.name=?1",
            nativeQuery = true
    )
    public Studentdetails findByName(String name);

    @Query(
            value ="SELECT * FROM studentdetails e WHERE e.role=?1",
            nativeQuery = true
    )
    public Studentdetails findByRole(String role);
}
