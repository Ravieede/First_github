//2D Array
class TwoD_Array
{
   public static void main(String[] args)
   {
     int b[][]=new int[][]{{1,2,3},{1,2,3,4},{1,2,3,4,5}};
     for(int r=0;r<=b.length-1;r++)
     {
      for(int c=0;c<=b[r].length-1;c++)
      {
         System.out.print(b[r][c]+" ");
       }
       System.out.println();
      }
   }
}