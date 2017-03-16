/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi3;

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
public class Monedero3IT {
    
    public Monedero3IT() {
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
    @Test
    public void testMondedor3() throws ErrorRetirarDineroException, ErrorCantidadInicialException, ErrorIngresarDineroException{
        System.out.println("Constructor");
        System.out.println("Constructor sin datos");
        Monedero3 constructorSinDato = new Monedero3();
        assertNotNull(constructorSinDato);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Constructor con datos..... 20");
        Monedero3 constructorConDato = new Monedero3(20);
        assertEquals(20,constructorConDato.getSaldo(),0.0);
        
        System.out.println("Contructor valor maximo");
        Monedero3 constructorMaxValue =new Monedero3(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, constructorMaxValue.getSaldo(), 0);
        
        System.out.println("Constructor minimo valor");
        Monedero3 constructorMinValue=new Monedero3(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, constructorMinValue.getSaldo(), 0);
        
        
        System.out.println("Sacar dinero......dato 20");
        Monedero3 instancia =new Monedero3(20);
        instancia.retirar((double)20);
        assertEquals(0, instancia.getSaldo(), 0);
        
        System.out.println("Ingresar dinero............dato 20");
        Monedero3 instancia1 = new Monedero3();
        instancia1.ingreso(20.0);
        assertEquals(20.0, instancia1.getSaldo(), 0);
    }
    
    /**
     * Test of ingreso method, of class Monedero3.
     */
    @Test(expected = ErrorIngresarDineroException.class)
    public void testIngreso1() throws ErrorIngresarDineroException {
        System.out.println("Test ingreso..........dato entrada 0");
        Monedero3 instance = new Monedero3();
        instance.ingreso(0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test(expected = ErrorIngresarDineroException.class)
    public void testIngreso2() throws ErrorIngresarDineroException{
        System.out.println("Test ingreso....................... dato de entrada -8");
        Monedero3 instance =new Monedero3();
        instance.ingreso(-8.0);
    }
    /**
     * Test of retirar method, of class Monedero3.
     */
    @Test(expected = ErrorRetirarDineroException.class)
    public void testRetirar() throws Exception {
        System.out.println("Test retirar dinero..................dato de entrada 0");
        Monedero3 instance = new Monedero3();
        instance.retirar(0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test(expected = ErrorRetirarDineroException.class)
    public void testRetirar2() throws ErrorRetirarDineroException{
        System.out.println("Test retirar dinero....................dato de entrada -8");
        Monedero3 instance =new Monedero3();
        instance.retirar(-8.0);
    }
    /**
     * Test of verSaldo method, of class Monedero3.
     */
    @Test
    public void testVerSaldo() {
        System.out.println("verSaldo");
        Monedero3 instance = new Monedero3();
        instance.verSaldo();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
