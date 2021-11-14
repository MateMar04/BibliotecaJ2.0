public class direccion {

    private final String calle;
    private final String numero;
    private final barrio barrio;

    public direccion(String calle, String numero, barrio b2) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = b2;
    }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + barrio;
    }


}
