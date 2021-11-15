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

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", mail=" + mail + ", direccion= " + direccion + '}';
    }


}
