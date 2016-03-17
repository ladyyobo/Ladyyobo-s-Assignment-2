import java.util.Random;

public class FortuneCookie 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int num1 = 1 + r.nextInt(54);
        int num2 = 1 + r.nextInt(54);
        int num3 = 1 + r.nextInt(54);
        int num4 = 1 + r.nextInt(54);
        int num5 = 1 + r.nextInt(54);
        int num6 = 1 + r.nextInt(54);
        
        int fortune = 1 + r.nextInt(6);
        String response = "";
        
        if ( fortune == 1)
          response = "Life is good";
        else if (fortune == 2)
            response = "You will find love";
        else if(fortune == 3)
            response = "Love yourself";
        else if (fortune == 4)
            response = "Love your spouse";
        else if (fortune == 5)
            response = "Enjoy";
        else if (fortune == 6)
            response = "Great future";
        else
            response = "No fortune for you";
        
        System.out.println("Fortune cookie says: " + response);
        System.out.println("\t" + num1 + "-" + num2 + "-" + num3 + "-" + num4 + "-" + num5 + "-" + num6);
        
        
    } 
    
}
