package com.example.service;

import com.example.dao.InstructionRepository;
import com.example.dao.MesstimeRepository;
import com.example.model.Instruction;
import com.example.model.Messtime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructionService {
    @Autowired
    private InstructionRepository instructionRepository;

    public Instruction updatemessInstruction(Instruction instruction){
        return instructionRepository.save(instruction);
    }

    public List<Instruction> fetchInstruction(){
        return instructionRepository.findAll();
    }


}
