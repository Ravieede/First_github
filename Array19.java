import java.util.Scanner;
class left_Rotations
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
     LeftRotations pc=new LeftRotations();
     pc.leftRotations(a);
 }
}
class LeftRotations
{
     void leftRotations(int b[])
     { 
      int rotation=3;
      for(int r=1;r<=rotation;r++)
      {
        int temp=b[0];
        for(int x=0;x<=b.length-2;x++)
        {
           b[x]=b[x+1];
        }
        b[b.length-1]=temp;
        System.out.println(r+" st"+" Left_Rotated Array:");
         for(int t:b)
          System.out.println(t);
      }
    }
}      