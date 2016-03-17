import java.util.Scanner;
public class CountingWithForLoop {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Type in message, and I'll display it five times");
      System.out.print( "Message: " );
      String message = input.nextLine();

        for ( int n = 2 ; n <= 10 ; n +=2 )
         {
            System.out.println( n + ". " + message );
           
        }

    }
}

