
package com.leolazc.ingredientes.service;

import com.leolazc.ingredientes.model.Ingrediente;
import java.util.List;


public interface IIngredienteService {
    
    public List<Ingrediente> getIngredientes();

    public void saveIngrediente(Ingrediente ing);

    public void deleteIngrediente(Long id);

    public Ingrediente findIngrediente(Long id);

    public void editIngrediente (Long id, Ingrediente ing);
    
    public List<Ingrediente> getIngredienteByPlato (String nombrePlato);
    
}
