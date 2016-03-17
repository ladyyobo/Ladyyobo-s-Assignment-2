import java.util.Scanner;
import java.util.Random;

public class NumberGuess 
{
    public static void main(String[] arg)
    {
      Scanner input =new  Scanner(System.in);
      Random r = new Random();
      int x = 1 + r.nextInt(10);
      int answer;
      
      System.out.println("I am thinking of an integer number between 1 and 10, guess what number");
      System.out.println("Your guess: ");
      answer=input.nextInt();
      if(answer== x)
      {
         System.out.println("You are correct");
      }
      else
      {
         System.out.println("Sorry, but I was really thinking of " + x);
      }
    }
    
}


