/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author joel_
 */
public class Validadores {
    public boolean validaClaveProducto(String clave){
        
        Pattern pattern = Pattern.compile("^[A-Z]{3}\\d{4}");
        Matcher matcher = pattern.matcher(clave);
        
        return matcher.matches();
    }
    
    public boolean validaNombreProducto(String nombre){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9\\s]{1,35}$");
        
        Matcher matcher = pattern.matcher(nombre);
        
        return matcher.matches();
    }
    
    public boolean validaUnidadProducto(String unidad){
        Pattern pattern = Pattern.compile("[A-Za-z]{2,3}");
        Matcher matcher = pattern.matcher(unidad);
        
        return matcher.matches();
    }
    
    public boolean validaCantidadReactivo(String cantidad){
        Pattern pattern = Pattern.compile("\\+?\\d+");
        Matcher matcher = pattern.matcher(cantidad);
        
        return matcher.matches();
    }
    
    public boolean validaDescripcionReactivo(String descripcion){
        Pattern pattern = Pattern.compile("^[a-zA-z0-9\\s]{1,50}");
        Matcher matcher = pattern.matcher(descripcion);
        
        return matcher.matches();
    }
}
