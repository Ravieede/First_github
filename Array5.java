import java.util.Scanner;
class ReverseArray
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    int b[]=new int[a.length];//321
    System.out.println("Enter array elements of a:");
      for(int x=0;x<=a.length-1;x++)
     {
        a[x]=sc.nextInt();
      }
      System.out.println("array of a elements: ");
       for(int x=0;x<=a.length-1;x++)
      {
        System.out.println("a["+x+"]="+a[x]);
      }
       int y=0;//3
       for(int x=a.length-1;x>=0;x--)
        {
            b[y]=a[x];//y=0 3,2,1
            y++;
        }
         for(int x=0;x<=b.length-1;x++)//0<=2t 
        {
        System.out.println("b["+x+"]="+b[x]);
	}
    }
}