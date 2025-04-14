import java.util.Scanner;
class A4
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER THE SIZE:");
   System.out.println("================");
   int size=sc.nextInt();
   int a[]=new int[size];
   System.out.println("ARRAY ELEMENTS OF A:");
   for(int x=0;x<=a.length-1;x++)
   {
     a[x]=sc.nextInt();
   }
   for(int x=0;x<=a.length-1;x++)
   {
     System.out.println("a["+x+"]= "+a[x]);
   }
   System.out.println(a.length);
   int i=0;
   int count=0;
   while(i<a.length)
   {
     if(a[i]<0)
     {
       count++;
     }
     i++;
   }
    System.out.println(count);
   int b[]=new int[count];
   int y=0;
   for(int x=a.length-1;x>=0;x--)
   {
     if(a[x]<0)
      {
        b[y]=a[x];
        y++;
      }
   }
   for(int x=0;x<b.length;x++)
   {
     System.out.println("b["+x+"]= "+b[x]);
   }
 }
}
   


   
