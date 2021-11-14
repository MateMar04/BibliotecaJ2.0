import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bibliotecaventana extends javax.swing.JFrame {
    private JPanel panel1;
    private JButton verLibrosButton;
    private JButton verClientesButton;
    private JLabel cantLibros;
    private JLabel cantRevistas;
    private JLabel cantClientes;
    private JLabel cantPublicaciones;
    private JButton verRevistasButton;

    public bibliotecaventana(biblioteca biblioteca) {
        add(panel1);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cantLibros.setText(String.valueOf(biblioteca.cantidadlibros()));
        cantRevistas.setText(String.valueOf(biblioteca.cantidadrevistas()));
        cantClientes.setText(String.valueOf(biblioteca.cantidadclientes()));
        cantPublicaciones.setText(String.valueOf(biblioteca.cantidadpublicaciones()));


        verLibrosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new librosventana(biblioteca).setVisible(true);
            }
        });
        verClientesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new clientesventana(biblioteca).setVisible(true);
            }
        });
        verRevistasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new revistasventana(biblioteca).setVisible(true);
            }
        });
    }
}
