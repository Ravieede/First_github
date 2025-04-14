//second max in Array
class Second_max
{
  public static void main(String[] args)
  {
    int a[]={12,34,67,54,89,72,43,97};
     int max=Integer.MIN_VALUE;
     int secondmax=Integer.MIN_VALUE;
     for(int x=0;x<=a.length-1;x++)
      {
         if(a[x]>max)
          {
             secondmax=max;
             max=a[x];
          }
          else if(a[x]>secondmax && a[x]!=max)
           {
              secondmax=a[x];
            }
     }
      System.out.println(secondmax);
  }
}
             