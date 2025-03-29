/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Validadores.Validadores;
/**
 *
 * @author joel_
 */
public class Producto {
    private String clave, nombre, unidad;
    private Validadores vd;
    public Producto() {
    }

    
    public Producto(String clave, String nombre, String unidad) {
        this.clave = clave;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public Boolean validarProducto(){
        vd= new Validadores();
        
        return vd.validaNombreProducto(this.getNombre())&&
                vd.validaClaveProducto(this.getClave())&&
                vd.validaUnidadProducto(this.getUnidad());
    }
    
}
