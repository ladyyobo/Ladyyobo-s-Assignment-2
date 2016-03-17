import java.util.Scanner;
public class CountingMachine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer to count to: ");
        int num = input.nextInt();
        for(int i =0; i <= num; i++){
          System.out.print(i +" ");
        }
        
    }
}


