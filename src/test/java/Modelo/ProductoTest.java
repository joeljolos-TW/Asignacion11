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
public class ProductoTest {
    
    public ProductoTest() {
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
    }    /**
     * Test of getClave method, of class Producto.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getClave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClave method, of class Producto.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        Producto instance = new Producto();
        instance.setClave(clave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnidad method, of class Producto.
     */
    @Test
    public void testGetUnidad() {
        System.out.println("getUnidad");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getUnidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnidad method, of class Producto.
     */
    @Test
    public void testSetUnidad() {
        System.out.println("setUnidad");
        String unidad = "";
        Producto instance = new Producto();
        instance.setUnidad(unidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarProducto method, of class Producto.
     */
    @Test
    public void testValidarProducto() {
        System.out.println("validarProducto");
        Producto instance = new Producto("ASD4152", "Teclado RGB", "pz");
        Boolean expResult = true;
        Boolean result = instance.validarProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    
}
