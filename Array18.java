//Right rotations
import java.util.Scanner;
class Right_Rotations
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Size:");
   int size=sc.nextInt();
   int a[]=new int[size];
   System.out.println("Enter Array Elements:");
   for(int x=0;x<=a.length-1;x++)
   {
     a[x]=sc.nextInt();
   }
     System.out.println("After insert Elements in Array:");
     for(int x=0;x<=a.length-1;x++)
    {
      System.out.println("a["+x+"]="+a[x]);
    }
     Rotations pc=new Rotations();
     pc.RightRotations(a);
 }
}
class Rotations
{
   void RightRotations(int b[])
    {
      int rotation=3;
      for(int r=1;r<=rotation;r++)
      {
         int temp=b[b.length-1];
         for(int x=b.length-2;x>=0;x--)
         {
           b[x+1]=b[x];
         }
           b[0]=temp;
           System.out.println("After Right Sorting");
           for(int t:b)
           System.out.println(t);
       }
    }
}     
      
    