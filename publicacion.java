public abstract class publicacion {
    private int cantidadprestamos;
    private final String titulo;


    public publicacion(String nombre) {
        this.titulo = nombre;

    }

    public void incrementarcantprestamos() {
        cantidadprestamos++;
    }

    @Override
    public String toString() {
        return "publicacion{" + titulo + " cantidadprestamos= " + cantidadprestamos + '}';
    }

    String getpublicaciones() {
        return titulo;
    }


}
