
package com.leolazc.platos.controller;
import com.leolazc.platos.dto.PlatoDTO;
import com.leolazc.platos.model.Plato;
import com.leolazc.platos.service.IPlatoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")
public class PlatosController {
    
     @Autowired
    private IPlatoService platoServ;
    
    @PostMapping ("/crear")
     public String crearIngrediente ( @RequestBody PlatoDTO plato) {
         platoServ.savePlato(plato.getNombre() , plato.getPrecio(), plato.getDescripcion());
         return "Plato guardado correctamente";
     }
     
     @GetMapping ("/traer")
    public List<Plato> traerPlatos () {
        return platoServ.getPlatos();
    }
    
    
}