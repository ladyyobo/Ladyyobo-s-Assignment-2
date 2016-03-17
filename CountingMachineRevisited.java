import java.util.Scanner;
public class CountingMachineRevisited {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to count from: ");
        int num1 = input.nextInt();
        System.out.println("Enter number to count to:");
        int num2 = input.nextInt();
        System.out.println("Count by:");
        int count = input.nextInt();
        for(int i = num1; i <= num2; i+= count ){
            System.out.print(i +" ");
        }
    }
}

