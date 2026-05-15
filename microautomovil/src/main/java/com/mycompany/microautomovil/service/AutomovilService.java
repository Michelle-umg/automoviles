/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microautomovil.service;


import com.mycompany.microautomovil.entity.Automovil;
import com.mycompany.microautomovil.repository.AutomovilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Michelle
 */
@Service

public class AutomovilService {
    
     @Autowired
    private AutomovilRepository automovilRepository;

    public List<Automovil> devolverAutos(){
        return automovilRepository.findAll();
    }
    
}
