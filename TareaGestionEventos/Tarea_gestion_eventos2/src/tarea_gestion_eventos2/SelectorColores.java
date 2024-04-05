/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_gestion_eventos2;

/**
 *
 * @author Adrian
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectorColores extends JFrame implements ItemListener {
    private JComboBox<String> comboBoxColores;
    private JPanel panelColor;

    public SelectorColores() {
        // Configuración de la ventana
        setTitle("Selector de Colores");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Componentes de la interfaz
        String[] colores = {"Rojo", "Verde", "Azul"};
        comboBoxColores = new JComboBox<>(colores);
        panelColor = new JPanel();
        panelColor.setPreferredSize(new Dimension(200, 100));
        panelColor.setBackground(Color.WHITE);

        // Configurar evento del JComboBox
        comboBoxColores.addItemListener(this);

        // Añadir componentes a la ventana
        add(comboBoxColores, BorderLayout.NORTH);
        add(panelColor, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String colorSeleccionado = (String) comboBoxColores.getSelectedItem();
            switch (colorSeleccionado) {
                case "Rojo":
                    panelColor.setBackground(Color.RED);
                    break;
                case "Verde":
                    panelColor.setBackground(Color.GREEN);
                    break;
                case "Azul":
                    panelColor.setBackground(Color.BLUE);
                    break;
            }
        }
    }
}
