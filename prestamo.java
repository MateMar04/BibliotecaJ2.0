import java.util.ArrayList;

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
