/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaExamen.service;

import com.practicaExamen.entity.Verdura;
import com.practicaExamen.repository.VerduraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fabiola Mora
 */
@Service
public class VerduraService implements IVerduraService {
    
    @Autowired
    private VerduraRepository verduraRepository;

    @Override
    public List<Verdura> getAllVerdura() {
       return (List<Verdura>)verduraRepository.findAll();
    }

    @Override
    public Verdura getVerduraById(long id) {
       return verduraRepository.findById(id).orElse(null);
    }

    @Override
    public void saveVerdura(Verdura verdura) {
        verduraRepository.save(verdura);
    }

    @Override
    public void delete(long id) {
        verduraRepository.deleteById(id);
    }
    
}