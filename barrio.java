public class barrio {

    private final String nombre;
    private final localidad localidad;

    barrio(String nombre, localidad localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "barrio{" + "nombre=" + nombre + ", localidad=" + localidad + '}';
    }

    void listadodebarrios() {
        System.out.println(nombre);
    }


}
