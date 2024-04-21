package tabla;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lamina2 extends JFrame {
    public Lamina2() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel nomeLabel = new JLabel("NOME");
        nomeLabel.setBounds(50, 50, 100, 20);
        JTextField nome = new JTextField(5);
        nome.setBounds(150, 50, 150, 20);

        JComboBox<String> curso = new JComboBox<>();
        curso.addItem("dam1");
        curso.addItem("dam2");
        curso.setBounds(350, 50, 150, 20);

        JLabel apelidoLabel = new JLabel("APELIDO");
        apelidoLabel.setBounds(50, 100, 100, 20);
        JTextField apelido = new JTextField(5);
        apelido.setBounds(150,100,150,20);

        JButton addTablebtn = new JButton("AGREGAR TABOA");
        addTablebtn.setBounds(350,100,150,20);

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable tabla = new JTable(tableModel);
        tableModel.addColumn("NOME");
        tableModel.addColumn("APELIDO");
        tableModel.addColumn("CURSO");
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(0,150,540,110);

        panel.add(addTablebtn);
        panel.add(nomeLabel);
        panel.add(nome);
        panel.add(curso);
        panel.add(apelidoLabel);
        panel.add(apelido);
        panel.add(scrollPane);

        add(panel);

        curso.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // cuando se cambia el curso borra los campos
            nome.setText("");
            apelido.setText("");
        }
        });

        addTablebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {          
                tableModel.addRow(new Object[] {nome.getText(),apelido.getText(),curso.getSelectedItem()});
                // borro los campos despues de introducirlos para mejor uso
                nome.setText("");
                apelido.setText("");     
            }
        });
        setTitle("Tabla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
