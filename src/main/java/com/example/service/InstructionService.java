package com.example.service;

import com.example.dao.InstructionRepository;
import com.example.model.Instruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InstructionService {
    @Autowired
    private InstructionRepository instructionRepository;

    public Instruction updatemessInstruction(Instruction instruction){
        return instructionRepository.save(instruction);
    }

    public Optional<Instruction> fetchInstruction(Integer id){
        return instructionRepository.findById(id);
    }


}
