import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class for Climber.
 *
 * @author  Cansu Karaboga
 * @version 1.0 4 Nov 2017
 */
public class ClimberTest
{
    private Climber climber1;
    private Climber climber2;
    private Climber climber3;

    /**
     * Default constructor for test class ClimberTest
     */
    public ClimberTest()
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
        climber1 = new Climber("luna", 26, true);
        climber2 = new Climber("test", -30, false);
        climber3 = new Climber("test2", 0, true);
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
    public void testGetClimberAge()
    {
 
        assertEquals(null, climber2.getAge());
        assertEquals(null, climber3.getAge());
        assertEquals(26, climber1.getAge());
    }

    @Test
    public void testGetClimberGender()
    {
        assertEquals(false, climber2.getGender());
        assertEquals(true, climber3.getGender());
        assertEquals(true, climber1.getGender());
    }
}



