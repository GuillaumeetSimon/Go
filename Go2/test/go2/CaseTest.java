/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;
// oioohio
//guillaume roku- 
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gassogba
 */
public class CaseTest {
    
    public CaseTest() {
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

    /**
     * Test of getCouleur method, of class Case.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Case instance = null;
        String expResult = "";
        String result = instance.getCouleur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class Case.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Case instance = null;
        Point2D expResult = null;
        Point2D result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLibertes method, of class Case.
     */
    @Test
    public void testGetLibertes() {
        System.out.println("getLibertes");
        Case instance = null;
        int expResult = 0;
        int result = instance.getLibertes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoisins method, of class Case.
     */
    @Test
    public void testGetVoisins() {
        System.out.println("getVoisins");
        Case instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getVoisins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVoisinsMechants method, of class Case.
     */
    @Test
    public void testGetVoisinsMechants() {
        System.out.println("getVoisinsMechants");
        Case instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getVoisinsMechants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCouleur method, of class Case.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        String couleur = "";
        Case instance = null;
        instance.setCouleur(couleur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class Case.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Point2D position = null;
        Case instance = null;
        instance.setPosition(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLibertes method, of class Case.
     */
    @Test
    public void testSetLibertes() {
        System.out.println("setLibertes");
        int l = 0;
        Case instance = null;
        instance.setLibertes(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoisins method, of class Case.
     */
    @Test
    public void testSetVoisins_ArrayList() {
        System.out.println("setVoisins");
        ArrayList<Case> voisins = null;
        Case instance = null;
        instance.setVoisins(voisins);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoisins method, of class Case.
     */
    @Test
    public void testSetVoisins_Case() {
        System.out.println("setVoisins");
        Case v = null;
        Case instance = null;
        instance.setVoisins(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoisinsMechants method, of class Case.
     */
    @Test
    public void testSetVoisinsMechants_ArrayList() {
        System.out.println("setVoisinsMechants");
        ArrayList<Case> voisinsMechants = null;
        Case instance = null;
        instance.setVoisinsMechants(voisinsMechants);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVoisinsMechants method, of class Case.
     */
    @Test
    public void testSetVoisinsMechants_Case() {
        System.out.println("setVoisinsMechants");
        Case v = null;
        Case instance = null;
        instance.setVoisinsMechants(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}