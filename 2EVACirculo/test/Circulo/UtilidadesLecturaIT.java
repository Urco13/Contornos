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
public class UtilidadesLecturaIT {
    
    public UtilidadesLecturaIT() {
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
     * Test of leerString method, of class UtilidadesLectura.
     */
    @Test
    public void testLeerString() {
        System.out.println("leerString");
        String expResult = "";
        String result = UtilidadesLectura.leerString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerEntero method, of class UtilidadesLectura.
     */
    @Test
    public void testLeerEntero() {
        System.out.println("leerEntero");
        int expResult = 0;
        int result = UtilidadesLectura.leerEntero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerFloat method, of class UtilidadesLectura.
     */
    @Test
    public void testLeerFloat() {
        System.out.println("leerFloat");
        float expResult = 0.0F;
        float result = UtilidadesLectura.leerFloat();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerDouble method, of class UtilidadesLectura.
     */
    @Test
    public void testLeerDouble() {
        System.out.println("leerDouble");
        String texto = "";
        double expResult = 0.0;
        double result = UtilidadesLectura.leerDouble(texto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerByte method, of class UtilidadesLectura.
     */
    @Test
    public void testLeerByte() {
        System.out.println("leerByte");
        byte expResult = 0;
        byte result = UtilidadesLectura.leerByte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
