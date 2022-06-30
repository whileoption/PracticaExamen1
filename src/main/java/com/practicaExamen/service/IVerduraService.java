/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicaExamen.service;

import com.practicaExamen.entity.Verdura;
import java.util.List;

/**
 *
 * @author Fabiola Mora
 */
public interface IVerduraService {
    public List<Verdura> getAllVerdura();
    public Verdura getVerduraById (long id);
    public void saveVerdura(Verdura verdura);
    public void delete (long id);
}

