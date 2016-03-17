import java.util.Scanner;
public class ContinueWhileLoop {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = input.nextLine();
        System.out.println("How many times");
        int nt  = input.nextInt();
        
        int n = 0;
        while(true){ 
            if(n < nt){
                System.out.println( ( n+10 )+  ". " + message);
            n ++;
            }
           
        }
    }
}


// Q1... It increaments the value of n by one after each iteration.




