import java.util.Random;
import java.util.Scanner;
public class FlipAgain {
    public static void main(String[] rgs){
        Scanner keyboard = new Scanner(System.in);
	Random rng = new Random();
        System.out.println("Would you like to flip?");
	String again = keyboard.next();
        
	do
	{
		int flip = rng.nextInt(2);
		String coin;

		if ( flip == 1 )
			coin = "HEADS";
		else
			coin = "TAILS";

		System.out.println( "You flip a coin and it is... " + coin );

		System.out.print( "Would you like to flip again (y/n)? " );
		again = keyboard.next();
		}
        while (again.equals("y"));
}
}

