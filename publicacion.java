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
public abstract class publicacion {
    private int cantidadprestamos ;
    private final String titulo;
   
    
    
     public publicacion(String nombre){
         this.titulo=nombre;
         
     }
    
    public void incrementarcantprestamos(){
        cantidadprestamos ++;
    }

    @Override
    public String toString() {
        return "publicacion{" +titulo+ " cantidadprestamos= " + cantidadprestamos + '}';
    }

    String getpublicaciones() {
        return titulo;
    }
   

    
    

    
    
    
}
