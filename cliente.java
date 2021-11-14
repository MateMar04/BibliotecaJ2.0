public class cliente {

    private final String nombre;
    private final String telefono;
    private final String mail;
    private final direccion direccion;


    public cliente(String nombre, String telefono, String mail, direccion d1) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = d1;
    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", mail=" + mail + ", direccion= " + direccion + '}';
    }


}
