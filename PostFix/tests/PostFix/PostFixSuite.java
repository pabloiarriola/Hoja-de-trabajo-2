/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Pablo Arriola
 * @author Christopher Aju
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PostFixTest.class, OperacionTest.class, PilaTest.class, PostFixMainTest.class, AbstractPilaTest.class})
public class PostFixSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}