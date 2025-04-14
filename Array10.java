//Second largest value 
class MAX
{
   public static void main(String[] args)
   {
     int max1=Integer.MIN_VALUE;
     int max2=Integer.MIN_VALUE;
     int a[]=new int[]{23,45,67,89,90,98};
     for(int i=0;i<=a.length-1;i++)
     {
        if(a[i]>max1)
         {
           max2=max1;
           max1=a[i];
        }
        else if(a[i]<max1 && a[i]>max2)
          max2=a[i];
    }
     System.out.println(max2);
   }
}
      
     