//Max number in array
class Max_Element_Array
{
 public static void main(String[] args)
 {
    int a[]={10,67,45,23,78,9,93,93,93,93};
    int max=a[0];
    for(int x=1;x<=a.length-1;x++)
     {
       if(a[x]>=max)
        {
             max=a[x];
        }
     }
     System.out.println(max);
 }
}
