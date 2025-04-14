//Selection sorting algorithm
import java.util.Scanner;
class Selection_Sort_Algorithm
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
     Check_SSA pc=new Check_SSA();
      pc.SSA(a);
  }
}
class Check_SSA
{
  void SSA(int arr[])
  {
    for(int x=0;x<=arr.length-2;x++)
    {
      int min=x;
     for(int y=min+1;y<=arr.length-1;y++)
      {
         if(arr[y]<arr[min])
          {
            min=y;
          }
       }
       int t=arr[x];
       arr[x]=arr[min];
       arr[min]=t;
     }
     System.out.println("After sorting:");
      for(int t:arr)
      System.out.println(t);
     
  } 
}
    
    