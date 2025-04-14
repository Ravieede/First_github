import java.util.Scanner;
class A2
{
 public static void main (String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Elements:");
   int size=sc.nextInt();
   int a[]=new int[size];
   int b[]=new int[size];
   System.out.println("Array elements of A:");
   for(int x=0;x<=a.length-1;x++)
   {
      a[x]=sc.nextInt();
   }
   for(int x=0;x<=a.length-1;x++)
   {
     System.out.println("a["+x+"]= "+a[x]);
   }
   for(int x=0,y=0;x<=b.length-1;x++,y++);
   {
     if(a[x]%2==0)
     b[y]=a[x];
   }
   for(int x=0,y=0;x<=b.length-1;x++,y++);
   {
     if(a[x]%2!=0)
     b[y]=a[x];
   }
    for(int x=0;x<=b.length-1;x++)
   {
     System.out.println("b["+x+"]= "+b[x]);
   }
 }
}
   
   
   