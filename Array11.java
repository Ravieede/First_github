//Binary search
import java.util.Scanner;
class Binary_Search
{
   public static void main(String[] args)
   {
     Sort pc=new Sort();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size:");
     int size=sc.nextInt();
     int a[]=new int[size];
      System.out.println("Enter Array elements of A:");
      for(int x=0;x<=a.length-1;x++)
      {
         a[x]=sc.nextInt();
      }
      for(int x=0;x<=a.length-1;x++)
      {
       System.out.println("a["+x+"]="+a[x]);
      }
       int b[]=pc.sorting(a);
       System.out.println("After Sorting :");
       for(int t:b)
       System.out.println(t);
       Check pb=new Check();
       System.out.println("Enter the Search Element:");
       int search=sc.nextInt();
       pb.M1(b,search);
      
   }
}
class Sort
{
   int[] sorting(int arr[])
   {
     for(int x=0;x<arr.length-1;x++)
     {
       for(int y=x+1;y<arr.length;y++)
       {
          if(arr[x]>arr[y])
           {
             int temp=arr[x];
              arr[x]=arr[y];
              arr[y]=temp;
            }
       }
     }
     return arr;
   }
}
class Check extends Sort
{
    void M1(int c[],int search)
   { 

    int first=0,last=c.length-1;
    int m=0;
    for(int x=0;x<=c.length-1;x++)
    {
      System.out.println("c["+x+"]="+c[x]);
    }
    for(int x=0;x<=c.length-1;x++)
     {
      
       m=(first+last)/2;
       if(search==c[m])
       {
         System.out.println("Element Found!:"+m);
         break;
       }
       else if(search>c[m])
       first=m+1;
       else
       last=m-1;
     }
      if(first>last)
      System.out.println("Element not found!:");
   }
}


     
    
     
   
     
      