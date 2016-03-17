
public class NoticingEvenNumbers {
    public static void main(String[] ags){
        for(int i = 1; i<=20; i++){
            if(i % 2 == 0){
                System.out.printf("%d is divisible by two hence it is an even num \n",i);
            }
            else
                System.out.printf("%d is not divisible by two hence it is an odd num \n",i);
        }
    }
}

