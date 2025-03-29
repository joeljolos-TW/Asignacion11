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
public class Reactivo {
    private String descripcion;
    private double cantidad;
    private Validadores vd;

    public Reactivo() {
    }

    public Reactivo(String descripcion, double cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return String.valueOf(cantidad);
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean validarReactivo(){
        vd= new Validadores();
        
        return vd.validaDescripcionReactivo(this.getDescripcion())
                &&vd.validaCantidadReactivo(this.getCantidad());
    }
}
