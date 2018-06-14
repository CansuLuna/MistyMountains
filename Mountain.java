/**
 * This is the Mountain class. It hold information about the mountain name and mountain height
 * This class also contains get & set methods for mountain name and height. 
 *
 * @author Cansu Karaboga
 * @version 1.0 4 Nov 2017
 */
public class Mountain
{
    
    private String mountainName;
    private int mountainHeight;
    
    /**
     * Constructor for objects of class Mountain
     */
    public Mountain()
    {
      
    }
    
    public void setMountainName(String name)
    {
        this.mountainName=name;
    }

    public String getMountainName()
    {
        return mountainName;   
    }
    
    public void setMountainHeight(int height)
    {
        this.mountainHeight=height;
    }
    
    public int getMountainHeight()
    {
        return mountainHeight;
    }
}
