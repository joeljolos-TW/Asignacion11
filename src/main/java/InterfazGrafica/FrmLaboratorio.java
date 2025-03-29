/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;

public final class FrmLaboratorio extends JFrame {
    
    // Componentes del menú
    private JMenuBar menuBar;
    private JMenu menuCatalogos, menuInventarios, menuConsultas, menuAyuda;
    private JMenu subMenuProductos, subMenuReactivos;
    private JMenuItem opcionAgregar, opcionSalir, opcionProductos;
    private JMenuItem opcionInventarioReactivos, opcionInventariar, opcionDesinventariar, opcionAcercaDe;
    
    public FrmLaboratorio() {
        super("Centro de Diagnóstico");
        initComponents();
        setupWindow();
        setupMenu();
    }
    
    private void initComponents() {
        menuBar = new JMenuBar();
        
        // Menús principales
        menuCatalogos = new JMenu("Catálogos");
        menuInventarios = new JMenu("Inventarios");
        menuConsultas = new JMenu("Consultas");
        menuAyuda = new JMenu("Ayuda");
        
        // Submenús
        subMenuProductos = new JMenu("Productos");
        subMenuReactivos = new JMenu("Reactivos");
        
        // Opciones de menú
        opcionAgregar = new JMenuItem("Agregar");
        opcionSalir = new JMenuItem("Salir");
        opcionProductos = new JMenuItem("Productos");
        opcionInventarioReactivos = new JMenuItem("Inventario Reactivos");
        opcionInventariar = new JMenuItem("Inventariar");
        opcionDesinventariar = new JMenuItem("Desinventariar");
        opcionAcercaDe = new JMenuItem("Acerca de...");
    }
    
    private void setupWindow() {
        setSize(600, 450); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    private void setupMenu() {
        
        // Configurar acciones
        opcionSalir.addActionListener(e -> salirAplicacion());
        opcionAgregar.addActionListener(e -> mostrarDialogoAgregar());
        opcionAcercaDe.addActionListener(e -> mostrarAcercaDe());
        opcionInventariar.addActionListener(e -> mostrarInventariar());
        opcionDesinventariar.addActionListener(e-> mostrarDesinventariar());
        
        // Construir estructura de menús
        subMenuProductos.add(opcionAgregar);
        subMenuReactivos.add(opcionInventariar);
        subMenuReactivos.add(opcionDesinventariar);
        
        menuCatalogos.add(subMenuProductos);
        menuCatalogos.addSeparator(); // Mejor que JSeparator para menús
        menuCatalogos.add(opcionSalir);
        
        menuInventarios.add(subMenuReactivos);
        
        menuConsultas.add(opcionProductos);
        menuConsultas.add(opcionInventarioReactivos);
        
        menuAyuda.add(opcionAcercaDe);
        
        // Agregar menús a la barra
        menuBar.add(menuCatalogos);
        menuBar.add(menuInventarios);
        menuBar.add(menuConsultas);
        menuBar.add(menuAyuda);
        
        setJMenuBar(menuBar);
    }
    
    // Métodos de acción
    private void salirAplicacion() {
        int confirm = JOptionPane.showConfirmDialog(
            this, 
            "¿Está seguro que desea salir?", 
            "Confirmar salida", 
            JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    private void mostrarDialogoAgregar() {
        // Ejemplo: Mostrar diálogo para agregar producto
        DlgProducto dlg = new DlgProducto(this);
        dlg.setVisible(true);
    }
    
    private void mostrarAcercaDe() {
        JOptionPane.showMessageDialog(
            this,
            "Centro de Diagnóstico v1.0\n© 2023 Laboratorios XYZ",
            "Acerca de",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void mostrarInventariar(){
        DlgReactivo dlg = new DlgReactivo(this,'i');
        dlg.setVisible(true);
    }
    private void mostrarDesinventariar(){
        DlgReactivo dlg = new DlgReactivo(this,'d');
        dlg.setVisible(true);
    }
}