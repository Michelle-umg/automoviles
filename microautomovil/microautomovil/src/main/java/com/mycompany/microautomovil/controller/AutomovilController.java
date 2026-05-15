/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microautomovil.controller;

import com.mycompany.microautomovil.entity.Automovil;
import com.mycompany.microautomovil.service.AutomovilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/automoviles")
/**
 *
 * @author Michelle
 */
public class AutomovilController {
    
    @Autowired
    private AutomovilService automovilService;

    @GetMapping
    public List<Automovil> devolverAutos(){
        return automovilService.devolverAutos();
    }
    
}
