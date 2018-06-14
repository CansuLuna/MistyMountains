

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class for Mountain.
 *
 * @author  Cansu Karaboga
 * @version 1.0 4 Nov 2017
 */
public class MountainTest
{
    private Mountain mountain1;
    private Mountain mountain2;
    private Mountain mountain3;

    

    /**
     * Default constructor for test class MountainTest
     */
    public MountainTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        mountain1 = new Mountain();
        mountain1.setMountainHeight(40);
        mountain2 = new Mountain();
        mountain2.setMountainHeight(-20);
        mountain3 = new Mountain();
        mountain3.setMountainHeight(0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetMountainName()
    {
        Mountain testMountain = new Mountain();
        testMountain.setMountainName("K2");
        assertEquals("K2",testMountain.getMountainName());
    }

    @Test
    public void testGetMountainHeight()
    {
        Mountain niceMountain = new Mountain();
        niceMountain.setMountainHeight(50);
        assertEquals(50, niceMountain.getMountainHeight());
    }

    
}



