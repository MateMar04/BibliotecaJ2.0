/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julian_rosas_16;

/**
 *
 * @author Julian Rosas
 */
public class localidad {

    private final provincia provincia;
    private final String nombre;

   

    public localidad(String nombre, provincia p) {
        this.nombre=nombre;
        this.provincia=p;
    }

    @Override
    public String toString() {
        return "localidad{" + "provincia=" + provincia + ", nombre=" + nombre + '}';
    }
    
    
}
