/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author joel_
 */
package InterfazGrafica;
import javax.swing.*;
import java.awt.*;
import Validadores.Validadores;

public class DlgProducto extends JDialog {
    
    private final JLabel lblClave = new JLabel("Clave:");
    private final JLabel lblNombre = new JLabel("Nombre:");
    private final JLabel lblUnidad = new JLabel("Unidad:");
    
    private final JTextField txtClave = new JTextField(15);
    private final JTextField txtNombre = new JTextField(15);
    private final JTextField txtUnidad = new JTextField(15);
    
    private final JButton btnAceptar = new JButton("Aceptar");
    private final JButton btnRestaurar = new JButton("Restaurar");
    private final JButton btnCancelar = new JButton("Cancelar");
    
    private final Validadores vd = new Validadores();
    
    public DlgProducto(JFrame parent) {
        super(parent, "Gestión de Producto", true);
        initComponents();
        setupListeners();
        setupLayout();
        pack();
        setLocationRelativeTo(parent);
    }
    
    private void initComponents() {
        // Configurar tamaños preferidos
        txtClave.setPreferredSize(new Dimension(150, 25));
        txtNombre.setPreferredSize(new Dimension(150, 25));
        txtUnidad.setPreferredSize(new Dimension(150, 25));
        
        // Configurar botones
        btnAceptar.setMnemonic('A');
        btnRestaurar.setMnemonic('R');
        btnCancelar.setMnemonic('C');
    }
    
    private void setupLayout() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Panel de campos
        JPanel fieldsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Fila 1 - Clave
        gbc.gridx = 0;
        gbc.gridy = 0;
        fieldsPanel.add(lblClave, gbc);
        
        gbc.gridx = 1;
        fieldsPanel.add(txtClave, gbc);
        
        // Fila 2 - Nombre
        gbc.gridx = 0;
        gbc.gridy = 1;
        fieldsPanel.add(lblNombre, gbc);
        
        gbc.gridx = 1;
        fieldsPanel.add(txtNombre, gbc);
        
        // Fila 3 - Unidad
        gbc.gridx = 0;
        gbc.gridy = 2;
        fieldsPanel.add(lblUnidad, gbc);
        
        gbc.gridx = 1;
        fieldsPanel.add(txtUnidad, gbc);
        
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
    
    private void setupListeners() {
        btnAceptar.addActionListener(e -> {
            if (vd.validaClaveProducto(getClave())&&
                    vd.validaNombreProducto(getNombre())&&
                    vd.validaUnidadProducto(getUnidad())) {
                
            }
        });
        
        btnRestaurar.addActionListener(e->{
            setClave("");
            setNombre("");
            setUnidad("");
        });
        
        btnCancelar.addActionListener(e->{
            dispose();
        });
    }
    
    // Métodos para acceder a los valores
    public String getClave() {
        return txtClave.getText();
    }
    
    public String getNombre() {
        return txtNombre.getText();
    }
    
    public String getUnidad() {
        return txtUnidad.getText();
    }
    
    // Métodos para asignar valores
    public void setClave(String clave) {
        txtClave.setText(clave);
    }
    
    public void setNombre(String nombre) {
        txtNombre.setText(nombre);
    }
    
    public void setUnidad(String unidad) {
        txtUnidad.setText(unidad);
    }
    
    // Métodos para los botones
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