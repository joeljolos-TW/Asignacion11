/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Validadores;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joel_
 */
public class ValidadoresTest {
    private Validadores val = new Validadores();
    public ValidadoresTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    void testValidaClaveProducto(){
        assertTrue(val.validaClaveProducto("JDB1254"));
        assertTrue(val.validaClaveProducto("ASD7777"));
        assertFalse(val.validaClaveProducto("sfp5478"));
        assertFalse(val.validaClaveProducto("pOlK7"));
    }

    @Test
    void testValidaNombreProducto(){
        assertTrue(val.validaNombreProducto("Teclado Logitech G215 Mecanico"));
        assertTrue(val.validaNombreProducto("BlueLabel de Johnny Walker"));
        assertFalse(val.validaNombreProducto("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
        assertFalse(val.validaNombreProducto("1234567891011121314151617181920212223242526272829303132333435"));
    }

    @Test
    void testValidaUnidadProducto(){
        assertTrue(val.validaUnidadProducto("pz"));
        assertTrue(val.validaUnidadProducto("lts"));
        assertFalse(val.validaUnidadProducto("metros"));
        assertFalse(val.validaUnidadProducto("pies"));
    }

    @Test
    void testValidaCantidadReactivo(){
        assertTrue(val.validaCantidadReactivo("233"));
        assertTrue(val.validaCantidadReactivo("619"));
        assertFalse(val.validaCantidadReactivo("-214"));
        assertFalse(val.validaCantidadReactivo(".69"));
    }
    
    @Test
    void testValidaDescripcionReactivo(){
        assertTrue(val.validaDescripcionReactivo("TecladoMecanicoGamer"));
        assertTrue(val.validaDescripcionReactivo("Procesador Ryzen"));
        assertFalse(val.validaDescripcionReactivo("Este teclado mecánico para videojuegos ofrece una respuesta ultrarrápida y una durabilidad excepcional, perfecto para largas sesiones de juego y escritura intensiva, con retroiluminación RGB personalizable y teclas programables."));
        assertFalse(val.validaDescripcionReactivo("Disfruta de una experiencia auditiva inmersiva con estos auriculares inalámbricos de alta fidelidad, con cancelación de ruido activa, batería de larga duración y un diseño ergonómico para máxima comodidad durante horas."));
    }

    
}
    

