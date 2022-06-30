/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicaExamen.controller;

import com.practicaExamen.entity.Sede;
import com.practicaExamen.entity.Verdura;
import com.practicaExamen.service.ISedeService;
import com.practicaExamen.service.IVerduraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author Fabiola Mora
 */
@Controller
public class VerduraController {
    
    @Autowired
    private IVerduraService verduraService;
    
    @Autowired
    private ISedeService sedeService;

    @GetMapping("/verdura")
    public String index (Model model){
      List<Verdura> listaVerdura = verduraService.getAllVerdura();
      model.addAttribute("titulo", "Tabla Verduras");
      model.addAttribute("verduras", listaVerdura);
        return "verduras";
    }
    
    @GetMapping("/verduraN")
    public String crearVerdura (Model model){
      List<Sede> listaSedes = sedeService.listSede();
      model.addAttribute("verdura", new Verdura());
      model.addAttribute("sedes", listaSedes);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarVerdura (@ModelAttribute Verdura verdura){
        verduraService.saveVerdura(verdura);
        return "redirect:/verdura";
    }
    
      @GetMapping("/editVerdura/{id}")
    public String editarVerdura(@PathVariable("id") Long idVerdura, Model model){
      Verdura verdura = verduraService.getVerduraById(idVerdura);
      List<Sede> listaSedes = sedeService.listSede();
      
      model.addAttribute("verdura",verdura);
      model.addAttribute("sedes", listaSedes);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarVerdura(@PathVariable("id") Long idVerdura){
      verduraService.delete(idVerdura);
        return "redirect:/verdura";
    }
    
    @GetMapping("/paiz")
    public String Vpaises (Model model){
     List<Sede> listaSedes = sedeService.listSede();
     model.addAttribute("titulo", "Tabla Sedes");
     model.addAttribute("sedess", listaSedes);
     return "seDe";
     
    }
}
