package com.example.controller;

import com.example.model.Foodmenu;
import com.example.model.Instruction;
import com.example.model.Messtime;
import com.example.service.InstructionService;
import com.example.service.MenuService;
import com.example.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class foodcomController {

    @Autowired
    private TimeService timeService;

    @Autowired
    private InstructionService instructionService;

    @Autowired
    private MenuService menuService;

    @PostMapping("/updateTime")
    public ResponseEntity<?> updateTime(@RequestBody Messtime messtime) {
        return ResponseEntity.ok(timeService.updatemessTime(messtime));
    }

    @PostMapping("/updateInstruction")
    public ResponseEntity<?> updateInstruction(@RequestBody Instruction instruction) {
        return ResponseEntity.ok(instructionService.updatemessInstruction(instruction));
    }

    @PostMapping("/updateMenu")
    public ResponseEntity<?> updateMenu(@RequestBody Foodmenu foodmenu) {
        return ResponseEntity.ok(menuService.updateFoodMenu(foodmenu));
    }


}
