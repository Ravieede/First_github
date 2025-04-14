//Missing elements
import java.util.Scanner;
class MissingElement
{
   public static void main(String[] args)
   {
     Missing_elements pc=new Missing_elements();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size:");
     int size=sc.nextInt();
     int a[]=new int[size];
     System.out.println("Enter Array elements:");
     for(int x=0;x<=a.length-1;x++)
     {
       a[x]=sc.nextInt();
     }
      System.out.println("Missing elements are:");
      pc.FindMissing(a);
   }
}
class Missing_elements
{
   void FindMissing(int arr[])
   {
    for(int x=1;x<=9;x++)
     {
        int count=0;
       for(int i=0;i<=arr.length-1;i++)
        {
           if(x==arr[i])
           {
              count++;
               break;
            }
        }
        if(count==0)
        {
          System.out.println(x);
        }
      }
    }
 } 
     
     
     
     
     