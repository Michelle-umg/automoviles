/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.microautomovil.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "automovil")
@Data

/**
 *
 * @author Michelle
 */
public class Automovil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;

    private String linea;

    private Integer modelo;
    
}
