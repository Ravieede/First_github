import java.util.Scanner;
class Array
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements :");
    int a[]=new int[sc.nextInt()];
    int b[]=new int[a.length];
    System.out.println("Array elements of  a:");
    for(int x=0;x<=a.length-1;x++)
     {
        a[x]=sc.nextInt();
     }
     System.out.println("a.array elements");
     for(int x=0;x<=a.length-1;x++)
     {
      System.out.println("a["+x+"]="+a[x]);
     }
     System.out.println("b.array elements");
    for(int x=0;x<=a.length-1;x++)
      {
        b[x]=a[x];
      }
    
    for(int x=0;x<=a.length-1;x++)
     {
      System.out.println("b["+x+"]="+b[x]);
     }
  }
}
       
     