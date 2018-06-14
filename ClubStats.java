import java.util.Scanner;
/**
 * This is the main class. This class provides the end user with a console.
 * This class connects rest of the classes together via user input.
 *
 * @author Cansu Karaboga
 * @version 1.0 4 Nov 2017
 */
public class ClubStats
{

    /**
     * Main method for Misty Mountains
     */
    public static void main (String[ ] args) 
    {  
        Scanner input = new Scanner(System.in);
        Club definedClub = new Club();
        System.out.println("Welcome to the Mountain Club");

        /**
         * Prints options for user to choose from on to the console
         */
        while(true)
        {
            System.out.println("\n");

            System.out.println("Please choos one :) \n"); 
            System.out.println("1. Create a new member"); 
            System.out.println("2. Show the Climber with highest average");
            System.out.println("3. Show the highest mountain climbed");
            System.out.println("4. List all mountains in the system");
            System.out.println("5. Exit");

            System.out.println("\n");          
            int choice=input.nextInt();

            /**
             * Reads and saves user input
             */           
            
          switch(choice)
            {
                case 1:System.out.println("Create a new member\n");
                System.out.println("enter member name");
                String memberName=input.next();

                boolean gender=false;
                System.out.println("Please select your gender (W) or (M)");
                String answer=input.next();
                if(answer.equalsIgnoreCase("M"))
                {
                    gender=true;
                }
                else if (answer.equalsIgnoreCase("W"))
                {
                    gender=false;
                }
                else
                {
                    System.out.println("Error, gender input invalid, returning you to the main menu.");
                    continue;
                }

                System.out.println("enter your age");
                int memberAge= input.nextInt();
                Climber newMember = new Climber(memberName,memberAge,gender);

                if(memberAge >= 18)
                {

                }
                else 
                {
                    System.out.println("Sorry but please come back when you are 18 years old,returning you to the main menu.");
                    continue;

                }

                System.out.println("Please enter the number of mountains you have climbed.");
                int numberOfMountain=input.nextInt();
                if(numberOfMountain >= 0)
                {System.out.println("Please enter a value that is greater than 0,returning you to the main menu.");

                    continue; 
                }
                else
                {
                    for(int i=0;i<numberOfMountain;i++)
                    {
                        System.out.println("enter mountain name");
                        String mountainName=input.next();

                        System.out.println("enter mountain height");
                        int mountainHeight=input.nextInt();

                        Mountain newMountain= new Mountain();
                        newMountain.setMountainHeight(mountainHeight);
                        newMountain.setMountainName(mountainName);

                        newMember.addNewMountain(newMountain);
                    }
                }

                definedClub.addNewClimber(newMember);
                break;

                case 2:System.out.println("Show the Climber with highest average\n");
                String highestClimber=definedClub.highestMountainClimber();

                System.out.println("   "+highestClimber);

                break;
                case 3:System.out.println("Show the highest mountain climbed\n");

                String highestMountain=definedClub.highestMountainRecorded();

                System.out.println("   "+highestMountain);
                break;
                case 4:System.out.println("List all mountains that are higher than a given height\n"); 

                System.out.println("enter a height limit");
                int limit=input.nextInt();
                definedClub.listOfMountains(limit);
                break;

                case 5:
                System.exit(0);
                break;
                default:System.out.println("Please start with 1 then go through 2 to 4. \n"); 
                break;
            }
        }

    }
}
