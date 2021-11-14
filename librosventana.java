import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class librosventana extends javax.swing.JFrame{
    private JPanel panel1;
    private JComboBox comboBoxLibros;
    private JLabel autorInfo;
    private JLabel tituloInfo;
    private JLabel editorialInfo;
    private JLabel categoriaInfo;

    public librosventana(biblioteca biblioteca) {
        setTitle("Libros");
        add(panel1);
        setSize(500, 500);

        ArrayList<libro> libros = biblioteca.getlibros();
        Vector comboboxitems = new Vector();
        for (int i = 0; i < libros.size(); i++) {
            comboboxitems.add(libros.get(i).getTitulo());
        }
        comboBoxLibros.setModel(new javax.swing.DefaultComboBoxModel(comboboxitems));
        comboBoxLibros.setSelectedIndex(-1);


        comboBoxLibros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                libro libro = libros.get(comboBoxLibros.getSelectedIndex());
                autorInfo.setText(libro.getAutor().toString());
                tituloInfo.setText(libro.getTitulo());
                editorialInfo.setText(libro.getEditorial().toString());
                categoriaInfo.setText(libro.getCategoria().toString());
            }
        });
    }
}
