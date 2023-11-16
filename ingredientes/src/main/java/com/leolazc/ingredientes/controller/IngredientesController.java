
package com.leolazc.ingredientes.controller;


import com.leolazc.ingredientes.model.Ingrediente;
import com.leolazc.ingredientes.service.IIngredienteService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredientes")
public class IngredientesController {
    
    @Autowired
    IIngredienteService ingreService;
    
    
    @PostMapping("/crear")
    public String crearIngrediente(@RequestBody Ingrediente ing){
        ingreService.saveIngrediente(ing);
        return "Ingrediente guardado correctamente";
    
    }
    
    @GetMapping("traer/{nombrePlato}")
    public List<Ingrediente> traerIngredienteByPlato(@PathVariable String nombrePLato){
        return ingreService.getIngredienteByPlato(nombrePLato);
    
    }
    
    
     @GetMapping("traer")
    public List<Ingrediente> traerIngredientes(){
        return ingreService.getIngredientes();
    
    }
    
}
