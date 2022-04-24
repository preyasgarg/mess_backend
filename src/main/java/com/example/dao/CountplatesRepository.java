package com.example.dao;

import com.example.model.Countplates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CountplatesRepository extends JpaRepository<Countplates, Integer> {


    @Query("select sum(breakfast),sum(lunch),sum(dinner) from Countplates")
    public List<Integer> getcountofplates();

    @Query(value = "select count(*) from Countplates where breakfastrating=1 " +
            "union " +
            "select count(*) from Countplates where breakfastrating=2" +
            "union" +
            "select count(*) from Countplates where breakfastrating=3"+
            "union"+
            "select count(*) from Countplates where breakfastrating=4"+
            "union"+
            "select count(*) from Countplates where breakfastrating=5",
        nativeQuery = true)
    public List<Integer> getbybreakfastrating();

    @Query(value = "select count(*) from Countplates where lunchrating=1 " +
            "union " +
            "select count(*) from Countplates where lunchrating=2" +
            "union" +
            "select count(*) from Countplates where lunchrating=3"+
            "union"+
            "select count(*) from Countplates where lunchrating=4"+
            "union"+
            "select count(*) from Countplates where lunchrating=5",
            nativeQuery = true)
    public List<Integer> getbylunchrating();

    @Query(value = "select count(*) from Countplates where dinnerrating=1 " +
            "union " +
            "select count(*) from Countplates where dinnerrating=2" +
            "union" +
            "select count(*) from Countplates where dinnerrating=3"+
            "union"+
            "select count(*) from Countplates where dinnerrating=4"+
            "union"+
            "select count(*) from Countplates where dinnerrating=5",
            nativeQuery = true)
    public List<Integer> getbydinnerrating();

    @Query(value="select breakfast,lunch,dinner from Countplates",nativeQuery = true)
    public List<Integer> getcountofplateshistory();


}
