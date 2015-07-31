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
public class AbstractPilaTest<E> {

    public AbstractPilaTest() {
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
     * Test of isEmpty method, of class AbstractPila.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AbstractPila instance = new AbstractPilaImpl();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of push method, of class AbstractPila.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object elemento = null;
        AbstractPila instance = new AbstractPilaImpl();
        instance.push(elemento);
    }

    /**
     * Test of pop method, of class AbstractPila.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        AbstractPila instance = new AbstractPilaImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class AbstractPila.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        AbstractPila instance = new AbstractPilaImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class AbstractPila.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractPila instance = new AbstractPilaImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of superPop method, of class AbstractPila.
     */
    @Test
    public void testSuperPop() {
        System.out.println("superPop");
        AbstractPila instance = new AbstractPilaImpl();
        instance.superPop();
    }

    /**
     * Test of suma method, of class AbstractPila.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        String a = "2";
        String b = "2";
        AbstractPila instance = new AbstractPilaImpl();
        String expResult = "4";
        String result = instance.suma(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class AbstractPila.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        String a = "2";
        String b = "2";
        AbstractPila instance = new AbstractPilaImpl();
        String expResult = "0";
        String result = instance.resta(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicacion method, of class AbstractPila.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        String a = "2";
        String b = "2";
        AbstractPila instance = new AbstractPilaImpl();
        String expResult = "4";
        String result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class AbstractPila.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        String a = "9";
        String b = "3";
        AbstractPila instance = new AbstractPilaImpl();
        String expResult = "0";
        String result = instance.division(a, b);
        assertEquals(expResult, result);
    }

    public class AbstractPilaImpl<E> extends AbstractPila<E> {

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