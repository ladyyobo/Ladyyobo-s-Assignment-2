import java.util.Scanner;
public class SafeSquareRoot {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
       
       System.out.println("SQAURE ROOT!");
        System.out.print("Enter a number: ");
       int num = n.nextInt();
       double sqr = Math.sqrt(num);
       while(true){
           if(num>0)
              System.out.printf("The square root of %d is %f \n",num,sqr);
              break;
            
           
       }
       if(num<0)
               System.out.println("You can't take the square root of a negative number");
    }
    
    
}

