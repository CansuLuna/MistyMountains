import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is the Club class. It hold information about Climbers.This class contains an accessor method to
 * new items in to the Climber list.Club class also includes accessor methods to retrieve the highest 
 * mountain recorded by a member of the club,the list of all mountains that have been recorded,that are 
 * higher than a given level,the climber who has recorded the highest average mountain height. 
 * 
 * @author Cansu Karaboga
 * @version 1.0 4 Nov 2017
 */
public class Club
{   
    private ArrayList<Climber> Climbers;

    /**
     * Constructor for objects of class Club
     */
    public Club ()
    {
        this.Climbers = new ArrayList<Climber>();
    }

    public void addNewClimber (Climber Member)
    {

        Climbers.add(Member);
    }
    
    public ArrayList<Climber> getClimbers ()
    {
        return Climbers;
    }
    
    /**Accessor method for the climber who has recorded the highest average mountain height
      *@param no parameter is taken 
      *@return a single string/Climber 
      */
    public String highestMountainClimber()
    { 
        String tempClimber=null;
        double average=0.0;

        for(int i=0;i< this.Climbers.size();i++){

            int number=this.Climbers.get(i).getMountainList().size();

            for(int j=0;j<number;j++)
            {

                if(this.Climbers.get(i).averageHeight()>average){
                    tempClimber=this.Climbers.get(i).getName();
                    average=this.Climbers.get(i).averageHeight();
                }
            }
        }

        return tempClimber;  
    }

    /**Accessor method for the highest mountain recorded by a member of the club.
      *@param no parameter is taken 
      *@return single string value/name of a mountain
      */
    public String highestMountainRecorded()
    {
        
        String tempMountain=null;
        int height=0;

        for(int i=0;i< this.Climbers.size();i++)
        {

            int number=this.Climbers.get(i).getMountainList().size();

            for(int j=0;j<number;j++){

                if(this.Climbers.get(i).getMountainList().get(j).getMountainHeight()>height){

                    tempMountain=this.Climbers.get(i).getMountainList().get(j).getMountainName();
                    height=this.Climbers.get(i).getMountainList().get(j).getMountainHeight();
                }
            }
        }

        return tempMountain; 

    }

    /**A list of all mountains that have been recorded,that are higher 
than a given level.
      *@param integar value taken  
      *@return list or a sigle value  is returned
      */
        public void listOfMountains (int givenLevel)
    {
        
        String tempMountain=null;
        int height=0;

        for(int i=0;i< this.Climbers.size();i++)
        {

            int number=this.Climbers.get(i).getMountainList().size();

            for(int j=0;j<number;j++)
            {

                if(this.Climbers.get(i).getMountainList().get(j).getMountainHeight()>givenLevel)
                {

                    tempMountain=this.Climbers.get(i).getMountainList().get(j).getMountainName();

                    height=this.Climbers.get(i).getMountainList().get(j).getMountainHeight();

                    System.out.println("Name:"+tempMountain+" "+"Height:"+height);
                }
            }
        }      
    }

}
