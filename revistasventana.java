import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class revistasventana extends javax.swing.JFrame {
    private JComboBox comboBoxRevistas;
    private JLabel autorInfo;
    private JLabel tituloInfo;
    private JLabel editorialInfo;
    private JLabel categoriaInfo;
    private JPanel panel1;

    public revistasventana(biblioteca biblioteca) {
        setTitle("Revistas");
        add(panel1);
        setSize(500, 500);

        ArrayList<revista> revistas = biblioteca.getrevistas();
        Vector comboboxitems = new Vector();
        for (int i = 0; i < revistas.size(); i++) {
            comboboxitems.add(revistas.get(i).getTitulo());
        }
        comboBoxRevistas.setModel(new javax.swing.DefaultComboBoxModel(comboboxitems));
        comboBoxRevistas.setSelectedIndex(-1);

        comboBoxRevistas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                revista revista = revistas.get(comboBoxRevistas.getSelectedIndex());
                autorInfo.setText(revista.getAutor().toString());
                tituloInfo.setText(revista.getTitulo());
                editorialInfo.setText(revista.getEditorial().toString());
                categoriaInfo.setText(revista.getCategoria().toString());
            }
        });
    }
}
