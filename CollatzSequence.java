import java.util.Scanner;
public class CollatzSequence {
    public static void main(String[] nat){
        Scanner n = new Scanner(System.in);
        System.out.println("Starting number:");
        int num  = n.nextInt();
        int i = 0;
        int max =0;
        while(num !=1){
            if (num%2 ==0){
                num = num/2;
                System.out.print("\t" +num);
                i++;
            }
            else
                num  = (num*3) +1;
                 System.out.print("\t" +num);
                i++;
            if (num>max){
                max  = num;
            }
        
        }
    System.out.println();
    System.out.println("Terminated after " + i +"steps");  
    System.out.println("The largest number is " + max);
    }
}

