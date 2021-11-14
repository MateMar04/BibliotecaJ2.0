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
public class cliente {

    private final String nombre;
    private final String telefono;
    private final String mail;
    private final direccion direccion;
    

    public cliente(String nombre, String telefono, String mail, direccion d1) {
        this.nombre=nombre;
        this.telefono=telefono;
        this.mail=mail;
        this.direccion=d1;
    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", mail=" + mail + ", direccion= " + direccion + '}';
    }

   

    
    
    
}
