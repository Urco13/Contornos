/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apimonedero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author urco1
 */
public class MonederoTest {
    
    public MonederoTest() {
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
    public void testMonedero() throws DineroInicialExcepcion3{
        System.out.println("Constructor monedero vacio");
        System.out.println("Prueba constructor sin datos");
        Monedero objeto = new Monedero();
        assertNotNull(objeto);
        
        System.out.println("Constructor con datos....20 ");
        Monedero obMonedero =new Monedero(20);
        assertEquals(20, obMonedero.getSaldo(), 0.0);
        
        System.out.println("Meter Dinero ......20");
        System.out.println("Resultado true");
        Monedero meterDinero=new Monedero();
        meterDinero.ingreso((double)20);
        assertEquals(20,meterDinero.getSaldo() , 0);
        
        System.out.println("Sacar Dinero.....20");
        System.out.println("Resultado true");
        Monedero sMonedero=new Monedero(20);
        sMonedero.retirar((double)20);
        assertEquals(0, sMonedero.getSaldo(), 0);
    }
    
    /**
     * Test of ingreso method, of class Monedero.
     * 
     * @throws apimonedero.DineroInicialExcepcion3
     */
    @Test(expected = DineroInicialExcepcion3.class)
    public void testIngreso() throws DineroInicialExcepcion3 {
        System.out.println("Error ingreso.......dato=0");
        Monedero instance = new Monedero(20);
        instance.ingreso((double)0);//provocamos la excepcion
//        assertEquals(0, 0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * 
     * @throws DineroInicialExcepcion3 
     */
    @Test(expected = DineroInicialExcepcion3.class)
    public void testIngreso2() throws DineroInicialExcepcion3{
        System.out.println("Error ingreso........dato=-8");
        Monedero instancia = new Monedero(20);
        instancia.ingreso((double)-8);//provocamos la excepcion;
    }
    
    /**
     * Test of retirar method, of class Monedero.
     * @throws apimonedero.DineroInicialExcepcion3
     * 
     */
    @Test(expected = DineroInicialExcepcion3.class)
    public void testRetirar() throws DineroInicialExcepcion3 {
        System.out.println("No valido  retirar............dato=0");
        Double sacarDinero = 0.0;
        Monedero instance = new Monedero(20);
        instance.retirar(sacarDinero);//provocamos la excepcion
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
    @Test(expected = DineroInicialExcepcion3.class)
    public void testRetirar2() throws DineroInicialExcepcion3{
        System.out.println("No valido 1 retirar...........dato=-8 ");
        Double sacarDinero=-8.0;
        Monedero instance = new Monedero(20);
        instance.retirar(sacarDinero);
    }
    /**
     * Test of verSaldo method, of class Monedero.
     */
    @Test
    public void testVerSaldo() {
        System.out.println("verSaldo");
        Monedero instance = new Monedero();
        instance.verSaldo();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Monedero.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Monedero instance = new Monedero();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
