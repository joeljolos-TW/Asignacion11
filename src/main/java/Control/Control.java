/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JFrame;
import Validadores.Validadores;
import Modelo.*;
import InterfazGrafica.*;
import javax.swing.JOptionPane;
public class Control {
    private Validadores vd = new Validadores();
    
    // Método para agregar un producto
    public void agregaProducto(DlgProducto dialog) {
        DlgProducto producto = dialog;
        
        Producto pro = new Producto(producto.getClave(), producto.getNombre(), producto.getUnidad());
        
        if(pro.validarProducto()){
            JOptionPane.showMessageDialog(dialog, "el producto a sido agregado");
        }else{
            JOptionPane.showMessageDialog(dialog, "los datos proporcionados, no son validos");   
        }
        producto.dispose();
    }
    
    // Método para inventariar un reactivo
    public void inventariaReactivo(DlgReactivo dialog) {
        DlgReactivo reactivo = dialog;
        
        Reactivo react = new Reactivo(reactivo.getDescripcion(), reactivo.getCantidad());
        
        if(react.validarReactivo()){
            JOptionPane.showMessageDialog(dialog, "el reactivo se a logrado inventariar");
        }else{
            JOptionPane.showMessageDialog(dialog, "los datos proporcionados, no son validos");
        }
        reactivo.dispose();
    }
    
    // Método para desinventariar un reactivo
    public void desinventariaReactivo(DlgReactivo dialog) {
        DlgReactivo reactivo = dialog;
        
        Reactivo react = new Reactivo(reactivo.getDescripcion(), reactivo.getCantidad());
        
        if(react.validarReactivo()){
            JOptionPane.showMessageDialog(dialog, "el reactivo se a logrado desinventariar");
        }else{
            JOptionPane.showMessageDialog(dialog, "los datos proporcionados, no son validos");
        }
        reactivo.dispose();
    }
}