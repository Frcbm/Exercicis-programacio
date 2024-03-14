/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyectored.red.dominio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author franc
 */
public class ListaAparatosTest {
    
    public ListaAparatosTest() {
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
     * Test of addToList method, of class ListaAparatos.
     */
    @Test
    public void testAddToList() {
        System.out.println("addToList");
        Aparato aparato = null;
        ListaAparatos instance = new ListaAparatos();
        instance.addToList(aparato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalConsumo method, of class ListaAparatos.
     */
    @Test
    public void testGetTotalConsumo() {
        System.out.println("getTotalConsumo");
        ListaAparatos instance = new ListaAparatos();
        double expResult = 0.0;
        double result = instance.getTotalConsumo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaAparatos method, of class ListaAparatos.
     */
    @Test
    public void testGetListaAparatos() {
        System.out.println("getListaAparatos");
        ListaAparatos instance = new ListaAparatos();
        instance.getListaAparatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalConsumo method, of class ListaAparatos.
     */
    @Test
    public void testSetTotalConsumo() {
        System.out.println("setTotalConsumo");
        double consumo = 0.0;
        ListaAparatos instance = new ListaAparatos();
        instance.setTotalConsumo(consumo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagadoDeEmergencia method, of class ListaAparatos.
     */
    @Test
    public void testApagadoDeEmergencia() {
        System.out.println("apagadoDeEmergencia");
        ListaAparatos instance = new ListaAparatos();
        instance.apagadoDeEmergencia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
