/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo Arriola
 * @author Christopher Aju
 */
public class PostFixTest {

    public PostFixTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of hacerOperacion method, of class PostFix.
     */
    @Test
    public void testHacerOperacion() {
        System.out.println("hacerOperacion");
        String cadena = "3 3 +";
        Operar instance = new Operar();
        String expResult = "6";
        String result = instance.hacerOperacion(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of reset method, of class PostFix.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Operar instance = new Operar();
        instance.reset();
    }

}