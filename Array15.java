//Recursion to print Prime or not
import java.util.Scanner;
class Prime_Recursion
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size:");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println(" Enter Array of elemnets:");
      for(int x=0;x<=a.length-1;x++)
      {
         a[x]=sc.nextInt();
      }
      Prime_Recursion pc=new Prime_Recursion();
      pc.Prime(a,0,0)
      System.out.println("prime Found In Array Element:");
      fo(int t:arr)
      System.out.println(t);
     void Prime(int arr[],int x,int count)
     {
      if(x>arr.length-1)
       {
         if(count==2)
         System.out.println(arr.length-1);
       }
       else
       {
         if(arr.length-1% x==0)
          {
              count++;
            Prime(x+1,arr.length-1,count);
           }
       }
    }
}
    
          
      