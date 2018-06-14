import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is the Climber class. It hold information about the climbers name, age,gender and 
 * a list of mountains.This class also contains get & set methods for climbers name,height,gender and the
 * mountain list. Climber class includes accessor methods to retrieve the highest mountain recorded by 
 * the climber,average height mountain recorded by the climber,list of all mountains recorded by the 
 * climber with a height greater than a given level.
 * @author Cansu Karaboga
 * @version 1.0 4 Nov 2017
 */
public class Climber
{

    private String climberName;
    private int climberAge;
    private boolean climberGender;
    private ArrayList<Mountain> mountainsClimbed;

    /**
     * Constructor for objects of class Climber
     */
    public Climber(String climberName, int climberAge, boolean climberGender)
    
    {
        this.climberName=climberName;
        this.climberAge=climberAge;
        this.climberGender=climberGender;
        this.mountainsClimbed= new ArrayList<Mountain> ();

    }

    public void setName(String climberName)
    {
        this.climberName=climberName;
    }

    public String getName()
    {
        return this.climberName;
    }

    public void setAge( int climberAge)
    {
        this.climberAge=climberAge;
    }

    public int getAge()
    {
        return this.climberAge;
    }

    public void setGender (boolean climberGender)
    {
        this.climberGender=climberGender;
    }

    public boolean getGender()
    {
        return this.climberGender;
    }

    public void addNewMountain (Mountain theMountain)
    {

        mountainsClimbed.add(theMountain);
        
    }
    
    public ArrayList<Mountain> getMountainList()
    {
        return this.mountainsClimbed;
    }

    /**Acessor method for the highest mountain recorded by this climber.
      *@param no parameter is taken 
      *@return maximum value 
     */	
    public int getMaxHighest()
    { 

        int currentMax=0;
        for(Mountain item : mountainsClimbed)
        {
            if(item.getMountainHeight() > currentMax)
            { currentMax=item.getMountainHeight();
            }
        }
        return currentMax;
    }

    /**Acessor method for the average height mountain recorded by this climber
      *@param no parameter is taken 
      *@return average value
      */
    public double averageHeight()
    {

        int Sum = 0;
        double average=0.0;
        for(int i=0;i<mountainsClimbed.size();i++)
        {
            Sum=Sum+mountainsClimbed.get(i).getMountainHeight();
            average= Sum/mountainsClimbed.size();

        }
        return average;
    }

    
    /**Acessor Method for the list of all mountains recorded by the climber with a height greater 
     * than a given level.
     *@param takes an integar value 
     *@return list of strings
     */
    public void getMountainsRecorded(int givenHeight)
    { 

        for (Mountain item : mountainsClimbed)
        { 
            if(givenHeight>item.getMountainHeight())
            {
                System.out.println(item.getMountainHeight());
            }
        }

    }
    

}
