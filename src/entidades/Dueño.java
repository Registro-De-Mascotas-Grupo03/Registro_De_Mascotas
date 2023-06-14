/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tokiro
 */
public class Dueño extends Persona{
    
    private List<Mascota> mascotas= new ArrayList<>();
    private List<Multa> multas =new ArrayList<>();
    /**
     * @return the mascotas
     */
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     * @param mascotas the mascotas to set
     */
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * @return the multas
     */
    public List<Multa> getMultas() {
        return multas;
    }

    /**
     * @param multas the multas to set
     */
    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
    
}
