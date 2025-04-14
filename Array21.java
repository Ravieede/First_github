//Selection Sort
import java.util.Scanner;
class Selection_sort
{
   public static void main(String[] args)
   {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Size: ");
    int size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("Enter Array ELements: ");
    for(int x=0;x<=a.length-1;x++)
    {
      System.out.print("Enter Array at Index "+x+" : "+ " ");
      a[x]=sc.nextInt();
    }
    System.out.println("After Entering Element Array:");
    Selection pc=new Selection();
     int c[]= pc.SelectionSort(a);
    
    System.out.println("After Selection Sort:");  
    for(int t:c)
    System.out.println(t);
 }
}
class Selection
{
    int[] SelectionSort(int b[])
    {
       for(int x=0;x<b.length-1;x++)
       {
          int min=x;
         for(int y=x+1;y<b.length;y++)
          {
               if(b[y]<b[min])
                {
                   min=y;
                }
                int temp=b[x];
                b[x]=b[min];
                b[min]=temp;
           }
            
        }
        return b;
    }
}   