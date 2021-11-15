import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class clientesventana extends javax.swing.JFrame {
    private JComboBox comboBoxClientes;
    private JComboBox comboBoxPrestamos;
    private JLabel nombreInfo;
    private JLabel direccionInfo;
    private JLabel telefonoInfo;
    private JLabel mailInfo;
    private JPanel panel1;

    public clientesventana(biblioteca biblioteca) {
        setTitle("Clientes");
        add(panel1);
        setSize(500, 500);

        Vector comboboxitems = new Vector();
        ArrayList<cliente> clientes = biblioteca.getclientes();

        for (int i = 0; i < clientes.size(); i++) {
            comboboxitems.add(clientes.get(i).getNombre());
        }
        comboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel(comboboxitems));
        comboBoxClientes.setSelectedIndex(-1);


        comboBoxClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cliente cliente = clientes.get(comboBoxClientes.getSelectedIndex());
                nombreInfo.setText(cliente.getNombre());
                direccionInfo.setText(cliente.getDireccion().toString());
                telefonoInfo.setText(cliente.getTelefono());
                mailInfo.setText(cliente.getMail());

                ArrayList<prestamo> prestamos = biblioteca.listadeprestamos();
                Vector comboboxitems = new Vector();

                for (int i = 0; i < prestamos.size(); i++) {
                    ArrayList<publicacion> publicaciones = prestamos.get(i).getprestamos();
                    if (prestamos.get(i).getCliente() == cliente) {
                        for (int j = 0; j < publicaciones.size(); j++) {
                            comboboxitems.add(publicaciones.get(j).getTitulo());
                        }
                    }

                }
                comboBoxPrestamos.setModel(new javax.swing.DefaultComboBoxModel(comboboxitems));
                comboBoxPrestamos.setSelectedIndex(-1);
            }
        });
    }
}
