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
public class prestamo {

    private final String fechapres;
    private final String fechadev;
    private final cliente cliente;
    ArrayList<publicacion> lista;


    public prestamo(String fechapres, String fechadev, cliente c1) {
        this.fechapres = fechapres;
        this.fechadev = fechadev;
        this.cliente = c1;
        lista = new ArrayList();
    }

    void agregar(publicacion pub) {
        lista.add(pub);
        pub.incrementarcantprestamos();
    }

    cliente getcliente() {
        return cliente;
    }

    ArrayList<publicacion> getprestamos() {
        return lista;
    }


}
