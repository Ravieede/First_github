//Toc check Alphabets are owels or not
import java.util.Scanner;
class Alpha
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("To check alphabet are vowels or not");
        while (true){
        System.out.print("qEnter the Alphabet:");
        char alpha=x.next().charAt(0);
        if(alpha=='a')
          System.out.print(alpha+" is a vowel");
        else if(alpha=='e')
          System.out.print(alpha+" is a vowel");
        else if(alpha=='i')
          System.out.print(alpha+" is a vowel");
        else if(alpha=='o')
           System.out.print(alpha+" is a vowel");
        else if(alpha=='u')
           System.out.print(alpha+" is a vowel");
         else 
         System.out.print(alpha+" is a consonent");
         System.out.println();
        } 
    }
}