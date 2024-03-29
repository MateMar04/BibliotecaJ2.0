public class Julian_rosas_16 {


    public static void main(String[] args) {
        provincia p = new provincia("cordoba");

        localidad loc1 = new localidad("capital", p);
        localidad loc2 = new localidad("carlos paz", p);

        barrio b1 = new barrio("valle escondido", loc1);
        barrio b2 = new barrio("cerro de las rosas", loc1);

        direccion d1 = new direccion("parra", "1234", b2);

        cliente c1 = new cliente("Juan perez", "12457567", "juanpere@gmail.com", d1);

        autor a1 = new autor("JK Rowling");
        autor a2 = new autor("Forms");

        categoria cat1 = new categoria("fantasia");
        categoria cat2 = new categoria("economia");

        editorial ed1 = new editorial("La salamandra");
        editorial ed2 = new editorial("Forms");

        publicacion libro1 = new libro("Harry Potter", a1, ed1, cat1);

        publicacion rev1 = new revista("Forms", a2, ed2, cat2);

        prestamo pres1 = new prestamo("12/08/21", "14/08/21", c1);
        pres1.agregar(libro1);

        biblioteca b = new biblioteca("Biblioteca unc");
        b.agregar(libro1);
        b.agregar(rev1);
        b.prestar(pres1);
        b.agregarcliente(c1);

        System.out.println("cantidad de prestamos : " + b.cantidadprestamos());

        System.out.println("mostrar publicacion y cantidad de prestamos: ");
        b.listarpublicacionycantprestamos();

        System.out.println("cantidad de libros que posee la biblioteca: ");

        System.out.println("cantidad total de publicaciones: " + b.cantidadpublicaciones());

        System.out.println("listado de publicaciones de la biblioteca: ");
        b.listadepublicaciones();

        System.out.println("listado de clientes a los q tienen una publicacion: ");
        b.listarclientesconprestamos();


        System.out.println("listado de barrios de los clientes : ");
        b1.listadodebarrios();

        new bibliotecaventana(b).setVisible(true);
    }

}
