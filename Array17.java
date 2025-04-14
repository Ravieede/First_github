//binary serach,sorting,insert
import java.util.Scanner;
class BSI
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);

     System.out.println("Enter the Size:");
     int size=sc.nextInt();
     
     int a[]=new int[size];
     System.out.println("Enter Array Elements:");
     for(int x=0;x<=a.length-1;x++)
     {
        a[x]=sc.nextInt();
     }
      System.out.println();

     Sort pc=new Sort();
     int d[]=pc.Sorting(a);
      System.out.println("After Sorting Array:");
      for(int p:d)
      System.out.println(p);
   
      Search mn=new Search();
      System.out.println("Enter the Search Element:");
      int search=sc.nextInt();
      int k[]=mn.Searching(d,search);
      System.out.println();
     
     Insert xz=new Insert();
     System.out.println("Enter the Index where to add in an array:");
     int index=sc.nextInt();
     System.out.println("Enter the Element to insert into the index:");
     int Element=sc.nextInt();
     int r[]=xz.Inserting(k,index,Element);
     System.out.println();
 
     System.out.println("After Inserting Array:");
     for(int i=0;i<=r.length-1;i++)
     {
       System.out.println(r[i]+" ");
     }
  }
}
class Sort
{
   int [] Sorting(int b[])
   {
     for(int x=0;x<=b.length-2;x++)
      {
         if(b[x]>b[x+1])
          {//
            int temp=b[x];
             b[x]=b[x+1];
             b[x+1]=temp;
               x=-1;
          }
       }
       return b;
    }
}
class Search
{
    int [] Searching(int c[],int search1)
     {
       int First=0;
       int Last=c.length-1,Mid=0;
      while(First<=Last)
      {
           Mid=(First+Last)/2;
           if(search1==c[Mid])
           {
             System.out.println("Element Found at id index:"+Mid);
               System.exit(0);
           }
            else if(search1>c[Mid])
            {
              First=Mid+1;
            }
            else if(search1<c[Mid])
            {
              Last=Mid-1;
            }
         }
          if(First>Last)
          {    
             System.out.println("Element not found!");
          }
         return c;
     }
}
class Insert
{
    int [] Inserting(int M[],int index1,int value)
    {
      if(index1<0||index1>M.length-1)
       {
            System.out.println("Invalid Index:");
             return M;
       }
      for(int x=M.length-2;x>=index1;x--)
       {
          M[x+1]=M[x];
       }
         M[index1]=value;
        return M;
    }
}

       


      
