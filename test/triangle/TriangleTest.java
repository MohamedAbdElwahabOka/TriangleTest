/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;


import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;


/**
 *
 * @author mohamed
 */
public class TriangleTest {
    private Triangle triangle;
    private static int a;
    private static int b;
    private static int c;
    
    
    public TriangleTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
          a=0;
          b=4;
          c=5;
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        a=0;
        b=0;
        c=0;
        System.out.println("AfterClass");
    }
    
    
    @Before
    public void setUp() {
        triangle = new Triangle(a,b,c);
         System.out.println("setUp");
    }
    
    @After
    public  void tearDown() {
      triangle = null;
      System.out.println("tearDown");
            
    }
    
    
    @Test
    public void testGetA() {
        Assert.assertEquals("a",triangle.getA(),a,0);
        System.out.println("a = " + triangle.getA());
    }

    @Test
    public void testGetB() {
         Assert.assertEquals("b",triangle.getB(),b,0);
        System.out.println("b = " + triangle.getB());
    }

    @Test
    public void testGetC() {
         Assert.assertEquals("c",triangle.getC(),c,0);
        System.out.println("c = " + triangle.getC());
    }

    @Test
    public void testAllPositive() {
      Assert.assertFalse("testAllPositive", triangle.allPositive());
      System.out.println("testAllPositive passed");
    }

    @Test
    public void testIsValid() {
        Assert.assertFalse("testIsValid", triangle.isValid());
      System.out.println("testIsValid passed");
    }
    
}
