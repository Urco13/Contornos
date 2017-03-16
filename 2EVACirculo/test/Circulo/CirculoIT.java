/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circulo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam115
 */
public class CirculoIT {
    
    public CirculoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setRadio method, of class Circulo.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        double radio = Double.MIN_VALUE;
        Circulo instance = new Circulo();
        instance.setRadio(radio);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRadio2() {
        System.out.println("setRadio");
        double radio = Double.MAX_VALUE;
        Circulo instance = new Circulo();
        instance.setRadio(radio);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    /**
     * Test of getRadio method, of class Circulo.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.getRadio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularArea method, of class Circulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Circulo instance = new Circulo();
        float expResult = 0.0F;
        float result = instance.calcularArea();
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of calcularLongitud method, of class Circulo.
     */
    @Test
    public void testCalcularLongitud() {
        System.out.println("calcularLongitud");
        Circulo instance = new Circulo();
        float expResult = 0.0F;
        float result = instance.calcularLongitud();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarRadio method, of class Circulo.
     */
    @Test
    public void testMostrarRadio() {
        System.out.println("comprobamos si es nulo...........");
        Circulo circulito = null;
        assertNull(circulito);
       
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test(expected = NullPointerException.class)
    public void testMostrarRadio2() {
        System.out.println("Comprobamos ");
        Circulo circulito = null;
        
        System.out.println("salta= NullPointerException");
        Circulo.mostrarRadio(circulito);
    }
}
