import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String choice;
        Die deathclient1 = new Die();
        Die deathclient2 = new Die();
        int death1datavalue,death2datavalue,roll2=0;
        do
        {
            death1datavalue=deathclient1.getRoll();
            death2datavalue=deathclient2.getRoll();
            int points=death1datavalue+death2datavalue;
            System.out.println("\nYou rolled "+death1datavalue+","+death2datavalue+" and sum is : "+points);
            if(points == 7 || points == 11)
            {
                System.out.println("\nYou Won !");
            }
            else if(points == 2 || points == 3 || points == 12)
            {
                System.out.println("\nYou Lose!");
            }
            else
            {
                roll2=0;
                while(roll2 != 7)
                {
                    death1datavalue=deathclient1.getRoll();
                    death2datavalue=deathclient2.getRoll();
                    roll2=death1datavalue+death2datavalue;
                    System.out.println("\nYou rolled "+death1datavalue+","+death2datavalue+" and sum is : "+roll2);
                    if (points == roll2)
                    {
                        System.out.println("\nYou Won !");
                        break;
                    }
                    else if (roll2 == 7)
                    {
                        System.out.println("\nYou Lose !");
                    }

                }
            }
            System.out.println("Would you like to play again? [y/n]");
            choice = input.nextLine();
        }while (choice.equals("y") || choice.equals("Y"));
    }
}