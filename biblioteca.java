/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julian_rosas_16;

import java.util.ArrayList;

/**
 * @author Julian Rosas
 */
public class biblioteca {

    private final String nombre;
    private final ArrayList<publicacion> listadepublicacion;
    private final ArrayList<prestamo> listadeprestamos;


    biblioteca(String nombre) {
        this.nombre = nombre;
        listadepublicacion = new ArrayList();
        listadeprestamos = new ArrayList();
    }

    void agregar(publicacion pub) {
        listadepublicacion.add(pub);
    }

    void prestar(prestamo pub) {
        listadeprestamos.add(pub);
    }

    int cantidadprestamos() {
        return listadeprestamos.size();
    }

    int cantidadpublicaciones() {
        return listadepublicacion.size();
    }

    void listarpublicacionycantprestamos() {
        for (publicacion pub : listadepublicacion) {
            System.out.println(pub);
        }
    }

    void listarclientesconprestamos() {
        for (prestamo p : listadeprestamos) {
            System.out.println(p.getcliente());
        }
    }

    void listadepublicaciones() {
        for (publicacion pub : listadepublicacion) {
            System.out.println(pub.getpublicaciones());
        }
    }

    void listadeprestamos() {
        for (prestamo p : listadeprestamos) {
            System.out.println(p.getprestamos());
        }
    }


}
