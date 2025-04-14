//Even elements into anthoer elements
import java.util.Scanner;
class A3
{
  public static void main(String[] args)
  {
    A3 mn=new A3();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    int even_size=0; 
    System.out.println("Array elements of A:");
    for(int x=0;x<a.length;x++)
    {
      a[x]=sc.nextInt();
    }
    System.out.println("Array elements of A:");
    for(int x=0;x<a.length;x++)
    {
      System.out.println("a["+x+"]="+a[x]);
    }
      even_size=(a.length+1)/2;
      int b[]=new int[even_size];
    for(int x=0,y=0;x<=a.length-1;x++)
      {
          b[y]=a[x];
           y++;
      }
      System.out.println("Array elements of B (Even-indexed elements):");
      for(int x=0;x<b.length-1;x++)
     {
      System.out.println("b["+x+"]="+b[x]);
    }
    }
}
