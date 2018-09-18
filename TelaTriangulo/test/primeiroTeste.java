/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import telatriangulo.negocio;

/**
 *
 * @author Bruno
 */
public class primeiroTeste {
    
    public primeiroTeste() {
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
    public void testeTeste(){
        negocio negocio = new negocio();
        assertTrue(negocio.validartriangulo(1, 1, 1).contains("Válido"));
        assertTrue(negocio.validartriangulo(1, 1, 1).contains("Equilátero"));
        assertFalse(negocio.validartriangulo(1, 1, 1).contains("Homem Aranha"));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
