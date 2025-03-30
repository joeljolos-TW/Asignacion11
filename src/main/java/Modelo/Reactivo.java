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
    private String cantidad;
    private final Validadores vd;

    public Reactivo() {
        vd = new Validadores();
    }

    public Reactivo(String descripcion, String cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        vd = new Validadores();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public boolean validarReactivo() {

        return vd.validaDescripcionReactivo(this.getDescripcion())
                && vd.validaCantidadReactivo(this.getCantidad());
    }
}
