public class localidad {

    private final provincia provincia;
    private final String nombre;


    public localidad(String nombre, provincia p) {
        this.nombre = nombre;
        this.provincia = p;
    }

    @Override
    public String toString() {
        return "localidad{" + "provincia=" + provincia + ", nombre=" + nombre + '}';
    }


}
