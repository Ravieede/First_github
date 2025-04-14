import java.util.Scanner;
class Sum
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER SIZE:");
     int a[]=new int[sc.nextInt()];
     System.out.println("Array elements of a:");
     int sum=0;
     for(int x=0;x<=a.length-1;x++)
     {
       a[x]=sc.nextInt();
       sum=sum+a[x];
     }
      for(int x=0;x<=a.length-1;x++)
       {
       System.out.println("arr["+x+"]= "+a[x]);
       }
      System.out.println("Sum of elements in array of a is:"+sum);
  }
}
     
    
       
      