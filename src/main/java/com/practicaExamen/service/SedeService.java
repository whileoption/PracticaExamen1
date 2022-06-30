/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaExamen.service;

import com.practicaExamen.entity.Sede;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practicaExamen.repository.SedeRepository;

/**
 *
 * @author Fabiola Mora
 */
@Service
public class SedeService implements ISedeService {
    
    @Autowired
    private SedeRepository localRepository;

    @Override
    public List<Sede> listSede() {
       return (List<Sede>)localRepository.findAll();
    }
    
}