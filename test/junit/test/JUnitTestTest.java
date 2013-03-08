/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicolajdamfrederiksen
 */
public class JUnitTestTest {
    
    public JUnitTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("the test begins");
    }
    
    @After
    public void tearDown() {
        
        System.out.println("the test has ended");
    }

    /**
     * Test of add method, of class JUnitTest.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 10;
        JUnitTest instance = new JUnitTest();
        int expResult = 15;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class JUnitTest.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 0;
        int b = 0;
        JUnitTest instance = new JUnitTest();
        int expResult = 0;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class JUnitTest.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 5;
        int b = 5;
        JUnitTest instance = new JUnitTest();
        int expResult = 25;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    }

