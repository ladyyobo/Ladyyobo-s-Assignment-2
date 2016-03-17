import java.util.Scanner;
import java.util.Random;
public class NumberGuessCounter {
    public static void main(String[] args){
        Scanner num  = new Scanner(System.in);
        Random r  = new Random();
        
        int rand = 1 +r.nextInt(10);
        int guess,nt = 1;
        System.out.println("I have a number between 1 and 10. Try to guess it.");
        System.out.println("Your guess");
        guess = num.nextInt();
         while(guess!=rand){
             System.out.println("That's incorrect. Guess again ");
              System.out.println("Your guess: ");
              guess = num.nextInt();
              nt ++;
         }
         System.out.println("Thats right! You are a good guesser.");
         System.out.println("It only took you " + nt + " times");
         }
        
    }

