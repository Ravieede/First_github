import java.util.Scanner;
class Sum
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER SIZE : ");
     int size=sc.nextInt();
     int a[]=new int[size];
     int b[]=new int[a.length-1];

      int c[]=new int[a.length+b.length];

      int y=0;
     System.out.println("Enter the array of a elements:");
     for(int x=0;x<=a.length-1;x++)
      {
        a[x]=sc.nextInt();
      }
       System.out.println("array of a elements: ");
       for(int x=0;x<=a.length-1;x++)
      {
       System.out.println("a["+x+"]="+a[x]);
       System.out.println();
      }
      System.out.println("Enter the array of b elements:");
       for(int x=0;x<=b.length-1;x++)
      {
         b[x]=sc.nextInt();
      }
      System.out.println("array of b elements: ");
     for(int x=0;x<=b.length-1;x++)
     {
      System.out.print("b["+x+"]= "+b[x]);
       System.out.println();
     }
     System.out.println(" a array elements are copying into c:"); 
     for(int x=0;x<=a.length-1;x++)
     {
        c[y]=a[x];
         y++;
     }
     for(int x=0;x<c.length;x++)
       System.out.println("c["+x+"]= "+c[x]);
       System.out.println();
      System.out.println(" b array elements are copying into c:"); 
     for(int x=0;x<=b.length-1;x++)
     {
        c[y]=b[x];
         y++;
     }
       for(int x=0;x<c.length;x++)
       System.out.println("c["+x+"]= "+c[x]);
       System.out.println();
  }
}


     
     