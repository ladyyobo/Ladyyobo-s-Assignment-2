import java.util.Scanner;
public class BabyNim {
    public static void main(String[] args)  {
        Scanner n  = new Scanner(System.in);
        
        int pz = 3;
        int a =3; int b =3; int c = 3;
        System.out.println("A: 3 B:3 C:3 ");

        while(true ){
            if(a>=0 && b>=0 && c>=0){
                System.out.print("Choose a pile: ");
                String pile = n.next();
                System.out.println("How many to remove from pile");
                int rem = n.nextInt();
                if("A".equals(pile)){
                    a  = a - rem;
                    System.out.printf("A:%d B:%d C:%d \n",a,b,c);
                    }
                else if("B".equals(pile)){
                    b = b -rem;
                    System.out.printf("A:%d B:%d C:%d \n",a,b,c);
                }
                else if("C".equals(pile)){
                    c = c -rem;
                    System.out.printf("A:%d B:%d C:%d \n",a,b,c);
            System.out.println("Choose a pile: ");
            }
            }
            else if(a< 0 &&b< 0 && c< 0){
    
                System.out.println("All piles are empty. Good job!!");}
        
    }
}

}

