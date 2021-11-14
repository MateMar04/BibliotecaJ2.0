import java.util.ArrayList;

public class biblioteca {

    private final String nombre;
    private final ArrayList<publicacion> listadepublicacion;
    private final ArrayList<prestamo> listadeprestamos;
    private final ArrayList<cliente> listadeclientes;
    private final ArrayList<libro> listadelibros;
    private final ArrayList<revista> listaderevistas;


    biblioteca(String nombre) {
        this.nombre = nombre;
        listadepublicacion = new ArrayList();
        listadeprestamos = new ArrayList();
        listadeclientes = new ArrayList();
        listadelibros = new ArrayList();
        listaderevistas = new ArrayList();
    }

    void agregar(publicacion pub) {
        listadepublicacion.add(pub);
    }

    void prestar(prestamo pub) {
        listadeprestamos.add(pub);
    }

    void agregarcliente(cliente cliente) {
        listadeclientes.add(cliente);
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

    public int cantidadlibros() {
        int cantidadlibros = 0;
        for (publicacion p : listadepublicacion) {
            if (p instanceof libro) {
                cantidadlibros++;
            }
        }
        return cantidadlibros;
    }

    public int cantidadrevistas() {
        int cantidadrevistas = 0;
        for (publicacion p : listadepublicacion) {
            if (p instanceof revista) {
                cantidadrevistas++;
            }
        }
        return cantidadrevistas;
    }

    public int cantidadclientes() {
        return listadeclientes.size();
    }



}
