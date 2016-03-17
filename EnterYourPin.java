import java.util.Scanner;
public class EnterYourPin {
    public static void main(String[] ags){
        Scanner key = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.println("ENTER YOUR PIN: ");
        int num = key.nextInt();
        
        while(num != pin){
            System.out.println("INCORRECT PIN. TRY AGAIN");
            System.out.println("ENTER YOUR PIN: ");
            num = key.nextInt();
        }
        
        System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
        
    }
             
            }

// Q1...They both campare a condition and produce an output based on the kind of result of the comparison.
// They both 

// Q2... A while statement will execute while the condition is true and it keeps looping until the condition is false. The if statement will execute once if the condition is true. 
//
// Q3...The variable was defined prior to the while loop.

// Q4..The loop runs endlessly without end.
// This is because no input was accepted so there was no comparison to be made. Since there was no comparison to be made, the loop runs endlessly.

