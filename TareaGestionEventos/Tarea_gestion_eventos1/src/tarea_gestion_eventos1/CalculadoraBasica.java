/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_gestion_eventos1;

/**
 *
 * @author Adrian
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraBasica extends JFrame implements ActionListener {
    private JTextField campoOperando1;
    private JTextField campoOperando2;
    private JButton botonSuma;
    private JButton botonResta;
    private JTextArea areaResultado;

    public CalculadoraBasica() {
        // Configuración de la ventana
        setTitle("Calculadora Básica");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Componentes de la interfaz
        campoOperando1 = new JTextField();
        campoOperando2 = new JTextField();
        botonSuma = new JButton("Sumar");
        botonResta = new JButton("Restar");
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);

        // Configurar eventos
        botonSuma.addActionListener(this);
        botonResta.addActionListener(this);

        // Añadir componentes a la ventana
        add(campoOperando1);
        add(campoOperando2);
        add(botonSuma);
        add(botonResta);
        add(areaResultado);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonSuma) {
            calcular('+');
        } else if (e.getSource() == botonResta) {
            calcular('-');
        }
    }

    private void calcular(char operador) {
        try {
            double operando1 = Double.parseDouble(campoOperando1.getText());
            double operando2 = Double.parseDouble(campoOperando2.getText());
            double resultado = 0;

            if (operador == '+') {
                resultado = operando1 + operando2;
            } else if (operador == '-') {
                resultado = operando1 - operando2;
            }

            areaResultado.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            areaResultado.setText("Error: Por favor ingrese números válidos en los operandos.");
        }
    }
}