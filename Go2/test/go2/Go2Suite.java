/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author gassogba
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({go2.CaseTest.class, go2.Point2DTest.class, go2.PlateauJeuTest.class, go2.Go2Test.class})
public class Go2Suite {

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