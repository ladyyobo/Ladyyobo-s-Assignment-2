import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo 
{
    public static void main(String[] args)
    {
         Scanner input =new  Scanner(System.in);
         Random r = new Random();
         int x = 1 + r.nextInt(100);
         int answer;
      
        System.out.println("I am thinking of a number between 1 and 100. Try to guess it.");
        System.out.println("Your guess: ");
        answer=input.nextInt();
        if(answer== x)
        {
           System.out.println("You guessed it! What are the odds");
        }
        else if(answer < x)
        {
           System.out.println("Sorry, you are too low. I was thinking of " + x);
        }
        else if(answer > x)
            System.out.println("Sorry, you are too high. I was thinking of " + x);
        else
            System.out.println("You are so off");
      
    }
    
}
