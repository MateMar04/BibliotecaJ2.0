public abstract class publicacion {
    private int cantidadprestamos;
    private final String titulo;
    private final autor autor;
    private final editorial editorial;
    private final categoria categoria;


    public publicacion(String nombre, autor autor, editorial editorial, categoria categoria) {
        this.titulo = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    public void incrementarcantprestamos() {
        cantidadprestamos++;
    }

    public String getTitulo() {
        return titulo;
    }

    public autor getAutor() {
        return autor;
    }

    public editorial getEditorial() {
        return editorial;
    }

    public categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "publicacion{" + titulo + " cantidadprestamos= " + cantidadprestamos + '}';
    }

    String getpublicaciones() {
        return titulo;
    }


}
