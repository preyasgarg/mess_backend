package com.example.service;

import com.example.dao.CountplatesRepository;
import com.example.model.Countplates;
import com.example.model.Instruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Countplateservice {

    @Autowired
    private CountplatesRepository countplatesRepository;

    public List<Integer> fetchplatecount(){
        return countplatesRepository.getcountofplates();
    }

    public List<Integer> getPlatehistory(){
        return countplatesRepository.getcountofplateshistory();
    }

    public Countplates postPlate(Countplates countplates){
        return countplatesRepository.save(countplates);
    }

}
