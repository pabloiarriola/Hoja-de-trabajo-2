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
public class PilaTest {

    public PilaTest() {
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
     * Test of isEmpty method, of class Pila.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Pila instance = new PilaImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of push method, of class Pila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object elemento = null;
        Pila instance = new PilaImpl();
        instance.push(elemento);
    }

    /**
     * Test of pop method, of class Pila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Pila instance = new PilaImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class Pila.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Pila instance = new PilaImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Pila.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Pila instance = new PilaImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of superPop method, of class Pila.
     */
    @Test
    public void testSuperPop() {
        System.out.println("superPop");
        Pila instance = new PilaImpl();
        instance.superPop();
    }

    public class PilaImpl<E> implements Pila<E> {

        public boolean isEmpty() {
            return false;
        }

        public void push(E elemento) {
        }

        public E pop() throws NullPointerException {
            return null;
        }

        public E peek() throws NullPointerException {
            return null;
        }

        public int size() {
            return 0;
        }

        public void superPop() {
        }
    }

}