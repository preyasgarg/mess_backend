package com.example.service;

import com.example.dao.CountplatesRepository;
import com.example.model.Countplates;
import com.example.model.Foodmenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateService {

    @Autowired
    private CountplatesRepository countplatesRepository;

    public List<Integer> fetchRate(Integer id) {
        if(id==1)
           return countplatesRepository.getbybreakfastrating();
        else if(id==2)
            return countplatesRepository.getbylunchrating();
        else
            return countplatesRepository.getbydinnerrating();
    }

    public Countplates postRating(Countplates countplates){
        return countplatesRepository.save(countplates);
    }

}
