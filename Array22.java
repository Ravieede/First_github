//Repeted array
class Repated_Array
{
  public static void main(String [] args)
  {
     int a[]={2,6,8,4,3,1,9,7,2,0,8,5,0,1,9,6,4,2};
     int b[]=new int[a.length];
     for(int x=0;x<=a.length-1;x++)
      {
          if(b[x]==1)
           continue;
	  int count=1;
       for(int y=x+1;y<=a.length-1;y++)
          {
            if(a[x]==a[y])
             {
                count++;
                 b[y]=1;
              }
         }   
           if(count>1)
            System.out.println(a[x]+"==>"+count); 
      }
      
   }
}