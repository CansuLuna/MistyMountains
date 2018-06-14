import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class for Club.
 *
 * @author  Cansu Karaboga
 * @version 1.0 4 Nov 2017
 */
public class ClubTest
{
    private Club club1;
    private Mountain mountain1;
    private Mountain mountain2;
    private Mountain mountain3;
    private Climber climber1;
    private Climber climber2;
    private Climber climber3;


    public ClubTest()
    {
    }

    @Before
    public void setUp()
    {
        club1 = new Club();
        mountain1 = new Mountain();
        mountain1.setMountainHeight(40);
        mountain2 = new Mountain();
        mountain2.setMountainHeight(20);
        mountain3 = new Mountain();
        mountain3.setMountainHeight(0);
        climber1 = new Climber("luna", 26, true);
        climber2 = new Climber("test", -30, false);
        climber3 = new Climber("test2", 0, false);
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
    public void testAddNewClimber()
    {
        Climber climber1 = new Climber("luna", 26, true);
        Climber climber2 = new Climber("test2", 31, false);

        club1.addNewClimber(climber1);
        
        ArrayList<Climber> climbers = club1.getClimbers();
       
        assertEquals(true, climbers.contains(climber1));
        assertEquals(false, climbers.contains(climber2));
        
        club1.addNewClimber(climber2);
        assertEquals(true, climbers.contains(climber2));
        
    }

    
    @Test
    public void testHighestMountainClimber()
    {
        Climber climber1 = new Climber("luna", 26, true);
        Climber climber2 = new Climber("george", 31, true);

        mountain1 = new Mountain();
        mountain1.setMountainHeight(40);
        mountain1.setMountainName("Everest");
        
        climber1.addNewMountain(mountain1);
        
        club1.addNewClimber(climber1);
        
        mountain2 = new Mountain();
        mountain2.setMountainHeight(20);
        mountain2.setMountainName("randomMountain");
        
        climber2.addNewMountain(mountain2);
        
        club1.addNewClimber(climber2);
        
        
        ArrayList<Climber> climbers = club1.getClimbers();
        
        assertEquals(true,climbers.contains(climber1));
        assertEquals(false,climbers.contains(climber2));
    }

    @Test
    public void testHighestMountainRecorded()
    {
        mountain1 = new Mountain();
        mountain1.setMountainHeight(40);
        mountain1.setMountainName("Everest");
        
        climber1.addNewMountain(mountain1);
        club1.addNewClimber(climber1);
        
        mountain2 = new Mountain();
        mountain2.setMountainHeight(20);
        mountain2.setMountainName("randomMountain");
        
        climber2.addNewMountain(mountain2);
        club1.addNewClimber(climber2);
        
        mountain3 = new Mountain();
        mountain3.setMountainHeight(50);
        mountain3.setMountainName("randomMountain");
        
        climber3.addNewMountain(mountain3);
        club1.addNewClimber(climber3);
        
        ArrayList<Climber> climbers = club1.getClimbers();
        
        assertEquals(true,climbers.contains(mountain3));
        assertEquals(false,climbers.contains(mountain2));
        assertEquals(false,climbers.contains(mountain1));
        
    }

    @Test
    public void testListOfMountains()
    {
        club1.listOfMountains(20);
    }
}


