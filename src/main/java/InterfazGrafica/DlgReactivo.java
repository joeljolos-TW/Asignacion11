/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Validadores.Validadores;
import control.Control;
/**
 *
 * @author joel_
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DlgReactivo extends JDialog {

    // Componentes de la interfaz
    private final JLabel lblCantidad = new JLabel("Cantidad:");
    private final JLabel lblDescripcion = new JLabel("Descripción:");

    private final JTextField txtCantidad = new JTextField();
    private final JTextField txtDescripcion = new JTextField();

    private final JButton btnAceptar = new JButton("Aceptar");
    private final JButton btnRestaurar = new JButton("Restaurar");
    private final JButton btnCancelar = new JButton("Cancelar");

    private final Validadores vd = new Validadores();
    

    // Constructor mejorado
    public DlgReactivo(JFrame parent, char opcion) {

        super(parent, (opcion == 'i' ? "Inventariar Reactivo" : "Desinventariar Reactivo"), true);

        initComponents();
        setupLayout();
        setupListeners(opcion);
        pack();
        setLocationRelativeTo(parent);

    }

    private void initComponents() {
        // Configurar tamaños y comportamientos
        txtCantidad.setColumns(15);
        txtDescripcion.setColumns(15);

        // Configurar botones
        btnAceptar.setMnemonic('A');
        btnRestaurar.setMnemonic('R');
        btnCancelar.setMnemonic('C');

        // Establecer botón por defecto (se activa con Enter)
        getRootPane().setDefaultButton(btnAceptar);
    }

    private void setupLayout() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel de campos con GridBagLayout para mejor control
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Fila 1 - Cantidad
        gbc.gridx = 0;
        gbc.gridy = 0;
        fieldsPanel.add(lblCantidad, gbc);

        gbc.gridx = 1;
        fieldsPanel.add(txtCantidad, gbc);

        // Fila 2 - Descripción
        gbc.gridx = 0;
        gbc.gridy = 1;
        fieldsPanel.add(lblDescripcion, gbc);

        gbc.gridx = 1;
        fieldsPanel.add(txtDescripcion, gbc);

        // Panel de botones
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        buttonsPanel.add(btnAceptar);
        buttonsPanel.add(btnRestaurar);
        buttonsPanel.add(btnCancelar);

        mainPanel.add(fieldsPanel);
        mainPanel.add(buttonsPanel);

        getContentPane().add(mainPanel);
    }

    private void setupListeners(char opcion) {

        if (opcion == 'i') {
            // Acción para el botón Aceptar
            btnAceptar.addActionListener(e -> {Control control = new Control();
                    control.inventariaReactivo(this);
                    dispose(); // Cierra el diálogo si los datos son válidos
                
            });
        } else if (opcion == 'd') {
            btnAceptar.addActionListener(e -> {Control control = new Control();
                control.desinventariaReactivo(this);
                dispose();
                
            });
        }

        // Acción para el botón Restaurar
        btnRestaurar.addActionListener(e -> {
            txtCantidad.setText("");
            txtDescripcion.setText("");
            txtCantidad.requestFocus();
        });

        // Acción para el botón Cancelar
        btnCancelar.addActionListener(e -> dispose());

    }

    // Métodos para acceder a los datos
    public String getCantidad() {
        return txtCantidad.getText();
    }

    public String getDescripcion() {
        return txtDescripcion.getText().trim();
    }

    // Métodos para establecer valores iniciales
    public void setCantidad(double cantidad) {
        txtCantidad.setText(String.valueOf(cantidad));
    }

    public void setDescripcion(String descripcion) {
        txtDescripcion.setText(descripcion);
    }

    // Métodos para acceder a los botones (opcional)
    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public JButton getBtnRestaurar() {
        return btnRestaurar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }
}
