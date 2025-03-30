/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

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
public class ReactivoTest {
    
    public ReactivoTest() {
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

    /**
     * Test of getDescripcion method, of class Reactivo.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Reactivo instance = new Reactivo();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Reactivo.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Reactivo instance = new Reactivo();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class Reactivo.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Reactivo instance = new Reactivo();
        String expResult = "";
        String result = String.valueOf(instance.getCantidad());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class Reactivo.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        String cantidad = "0.0";
        Reactivo instance = new Reactivo();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarReactivo method, of class Reactivo.
     */
    @Test
    public void testValidarReactivo() {
        System.out.println("validarReactivo");
        Reactivo instance = new Reactivo("Acido Sulfurico","125");
                
        boolean expResult = true;
        boolean result = instance.validarReactivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
