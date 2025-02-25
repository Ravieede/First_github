
//To check day =(monday,tuesday,wednesday,thursday,friday,staurday,sunday)
import java.util.Scanner;
class Day
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("To check day:");
        System.out.print("Enter the day number:");
        int day=x.nextInt();
        if(day==1)
          System.out.print("Monday");
        else if(day==2)
          System.out.print("Tuesday");
        else if(day==3)
           System.out.print("Wednesday");
        else if(day==4)
           System.out.print("Thursday");
        else if(day==5)
           System.out.print("Friday");
       else if(day==6)
            System.out.print("Staurday");
        else if(day==7)
            System.out.print("Sunday");
        else
            System.out.print("Invalid number");
                
    }
}