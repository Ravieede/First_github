//insert element in the array
import java.util.Scanner;
class Insert_Array
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Size: ");
     int size=sc.nextInt();
     int a[]=new int[size];
     System.out.println("Enter Array Elements: ");
     for(int x=0;x<=a.length-1;x++)
     {
       System.out.print("Array Element At Index "+x+" ");
       a[x]=sc.nextInt();
     }
     System.out.print("Array Elements Are : ");
     for(int x=0;x<=a.length-2;x++)
     {
        System.out.print(a[x]+" ");
     }
     System.out.println();
     
    InsertArray pc=new InsertArray();

    System.out.print("Enter Index: ");
    int Index=sc.nextInt();
    System.out.print("Enter Element :");
    int element=sc.nextInt();
    pc.insert(a,Index,element);
  }
}
class InsertArray
{
   void insert(int b[],int index,int Element)
   {
     for(int x=b.length-1;x<=index;x--)
     {
         b[x+1]=b[x];
     }
     b[index]=Element;  
     for(int t:b)
     System.out.println(t);    
     
  }
}