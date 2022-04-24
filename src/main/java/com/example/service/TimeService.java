package com.example.service;

import com.example.dao.MesstimeRepository;
import com.example.model.Messtime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {

    @Autowired
    private MesstimeRepository messtimeRepository;

    public Messtime updatemessTime(Messtime messtime){
        return messtimeRepository.save(messtime);
    }

    public List<Messtime> fetchTime(){
        return messtimeRepository.findAll();
    }
}
