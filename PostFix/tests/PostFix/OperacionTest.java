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
public class OperacionTest {

    public OperacionTest() {
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
     * Test of push method, of class Operacion.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String elemento = "";
        Operacion instance = new Operacion();
        instance.push(elemento);
    }

    /**
     * Test of pop method, of class Operacion.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Operacion instance = new Operacion();
        String expResult = "";
        String result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class Operacion.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Operacion instance = new Operacion();
        String expResult = "";
        String result = instance.peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Operacion.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Operacion instance = new Operacion();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of superPop method, of class Operacion.
     */
    @Test
    public void testSuperPop() {
        System.out.println("superPop");
        Operacion instance = new Operacion();
        instance.superPop();
    }

}