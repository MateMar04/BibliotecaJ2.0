public class barrio {

    private final String nombre;
    private final localidad localidad;

    barrio(String nombre, localidad localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return nombre + ", " + localidad;
    }

    void listadodebarrios() {
        System.out.println(nombre);
    }


}
