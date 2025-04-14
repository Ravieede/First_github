import java.util.Scanner;
class A2
{
  public static void main(String[] args)
  {
     A2 pc=new A2();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Elements:");
     int size=sc.nextInt();
     int a[]=new int[size];
     System.out.println("Array Elements of A:");
     for(int x=0;x<=a.length-1;x++)
     {
        a[x]=sc.nextInt();
     }
     for(int x=0;x<=a.length-1;x++)
     {
     System.out.println("a["+x+"]= "+a[x]);
     }
     pc.Main(a,0);
   }
     void Main(int arr[],int sum)
     {
    
      for(int x=0;x<=arr.length-1;x++)
        {
          sum=sum+arr[x];
        }
        System.out.println("===============");
        System.out.println("sum is:"+sum);
    }
}