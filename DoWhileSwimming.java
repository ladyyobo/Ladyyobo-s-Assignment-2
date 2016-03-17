import java.util.Scanner;
public class DoWhileSwimming {
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS";
        
        double minimumTemparature = 79.0;//degrees fahrenheit
        double currentTemparature ;
        double savedTemparature;
        int swimTime;
        
        System.out.println("What is the current water temparature?");
        currentTemparature = keyboard.nextDouble(); 
        savedTemparature = currentTemparature;//saves a copy of this value so we can use it later
        
        System.out.println("\nOkay, so the current water temprarure is " +currentTemparature + "F");
        System.out.println(swimmer1 + " approaches the lake......");
        
        
        swimTime = 0;
        while(currentTemparature >= minimumTemparature){
            System.out.print("\t" + swimmer1 + "swims for a bit.");
            swimTime++;
            System.out.println("Swim time: "+swimTime + " min.");
            Thread.sleep(600);//pause for 600 milliseconds
            currentTemparature -=0.5;// subtracts 1/2 degree from the water temparature
            System.out.println("\tThe current water temparature is now "+currentTemparature+ "F");
            
               }
        System.out.println(swimmer1 + " stops swiming.Total swim time: " +swimTime+" min.");
        currentTemparature = savedTemparature;// restores orignal temparature
        System.out.println("\nOkay, so the current water temparture is "+currentTemparature+"F");
        System.out.println(swimmer2+ " approaches the lake....");
        swimTime = 0;
        
        do{
          System.out.println("\t"+ swimmer2 + " swims for a bit");
          swimTime++;
          System.out.println(" Swim time: "+swimTime +" min.");
          Thread.sleep(600);
          currentTemparature -= 0.5;
          System.out.println("The current water temparature is now "+ currentTemparature +"F" );
          
        }
        while(currentTemparature >= minimumTemparature);
        
        System.out.println(swimmer2 + " stops swimming. Total simming time: "+ swimTime+ " min.");
        
        
        
    }
}
//Q1. Goofus and Gallant swim for the same amounbt of time

// Q2. The stop time for the two swimmers changes.that for Gallant is os zero and that of Goofus is 1 min

//Q3..He checks the temparature first

//Q4.Goofus does nt check the water temparature before diving into it

//Q5.while loop tests the condition before executing the code.
//do while runs through the code once before ececuting 


// while loop is the pre-test loop and do while is the post test loop.

