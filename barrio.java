/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julian_rosas_16;

/**
 * @author Julian Rosas
 */
public class barrio {

    private final String nombre;
    private final localidad localidad;

    barrio(String nombre, localidad localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "barrio{" + "nombre=" + nombre + ", localidad=" + localidad + '}';
    }

    void listadodebarrios() {
        System.out.println(nombre);
    }


}
