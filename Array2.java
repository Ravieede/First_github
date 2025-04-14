import java.util.Scanner;
class A1
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE ELEMENTS:");
     int arr[]=new int[sc.nextInt()];//
     /*arr[0]=10;
     arr[1]=20;
     arr[2]=30;
     arr[3]=40;
     arr[4]=50;*/
     System.out.println("ARRAY ELEMENTS :");
     for(int x=0;x<=arr.length-1;x++)
      {
        arr[x]=sc.nextInt();
       }  
    for(int x=0;x<=arr.length-1;x++)
    {
     System.out.println("arr["+x+"]= "+arr[x]);
    }
   }
}
    
    