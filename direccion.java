/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julian_rosas_16;

/**
 * @author Julian Rosas
 */
public class direccion {

    private final String calle;
    private final String numero;
    private final barrio barrio;

    public direccion(String calle, String numero, barrio b2) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = b2;
    }

    @Override
    public String toString() {
        return "direccion{" + "calle= " + calle + ", numero= " + numero + ", barrio= " + barrio + '}';
    }


}
