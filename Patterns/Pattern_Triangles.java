//Patterns_Triangles
class Pattern_Triangles
{
  public static void main(String[] args)
  {
    int row=5,col=5;
    for(int r=0;r<=row;r++)
     {
	for(int c=0;c<=r;c++)
	{
          System.out.print("# ");
	}
         System.out.println();
     }

     System.out.println("___________");
      for(int r=0;r<=row;r++)
     {
	for(int c=0;c<=r;c++)
	{
	  if(c==0||c==r||r==row)
	  { 
           System.out.print("# ");
	  }
	  else
          {
	   System.out.print(" "+" ");	
	  }
	}
	System.out.println();
     }

     System.out.println("___________");
      for(int r=0;r<=row;r++)
     {
	for(int c=0;c<=r;c++)
	{
	  if(r%2!=0)
	  { 
           System.out.print("$ ");
	  }
	  else
          {
	   System.out.print("# ");	
	  }
	}
	System.out.println();
     }
    
    System.out.println("_________");
     for(int r=0;r<=row;r++)
     {
	for(int c=0;c<=r;c++)
	{
	  if(c%2!=0)
	  { 
           System.out.print("$ ");
	  }
	  else
          {
	   System.out.print("# ");	
	  }
	}
	System.out.println();
     }
    
     System.out.println("__________");
       for(int r=1;r<=row;r++)
     {
         int temp=1;
	for(int c=1;c<=r;c++)
	{
           System.out.print(temp+" ");
	   temp++;
	}
	System.out.println();
     }

     System.out.println("____________");
      for(int r=1;r<=row;r++)
     {   
         int temp=1;
	for(int c=1;c<=r;c++)
	{
	   if(r==1)
	   { 
               temp++;
            System.out.print(temp+" ");
	   }
           else
	   {
 		 temp++;
	     System.out.print(temp+" ");
              
           }

	}
	System.out.println();
     }


    System.out.println("_________");
       for(int r=1;r<=row;r++)
       {   
	for(int c=1;c<=r;c++)
	{
            System.out.print(r+" ");
	}
	System.out.println();
     }

     System.out.println("_________");
       for(int r=1;r<=row;r++)
       {   
	for(int c=r;c>=1;c--)
	{
            System.out.print(c+" ");
	}
	System.out.println();
     }
     
     System.out.println("_________");
       for(int r=1;r<=row;r++)
       {   
	  int temp=r;
	for(int c=r;c>=1;c--)
	{
             System.out.print(temp+" ");
	     temp++;
	}
	System.out.println();
     } 


     System.out.println("_________");
       for(int r=1;r<=row;r++)
       {   
	  int temp=row;
	for(int c=1;c<=r;c++)
	{
             System.out.print(temp+" ");
	     temp--;
	}
	System.out.println();
     }   
   
      System.out.println("_________");
       for(int r=1;r<=row;r++)
       {   
        int temp=6-r;
	for(int c=temp;c<=5;c++)
	{
             System.out.print(c+" ");
	   
	}
	System.out.println();
     } 

    System.out.println("__________");
       for(int r=1;r<=row;r++)
       {
         int temp=1;
	for(int c=1;c<=r;c++)
	{
	   if(c==1||c==r||r==row)
	   {
            System.out.print(temp+" ");
	    temp++;
	   }
	   else
           {
	   System.out.print(" "+" ");	
	   }  
	}
	System.out.println();
     }
   
       
    System.out.println("__________");
       for(int r=1;r<=row;r++)
       {
	for(int c=1;c<=r;c++)
	{
	   if(c==1||c==r||r==row)
	   {
            System.out.print(c+" ");
	   }
	   else
           {
	   System.out.print(" "+" ");	
	   }  
	}
	System.out.println();
     }


        
     System.out.println("_________");
       for(int r=1;r<=row;r++)
       {   
	  int temp=r+1;
	for(int c=1;c<=r;c++)
	{
             System.out.print(temp+" ");
	     temp++;
	}
	System.out.println();
     }   


         
     System.out.println("_________");
       for(int r=1;r<=row;r++)
       {  
	for(int c=1;c<=r;c++)
	{
             System.out.print(2*c+" ");
	}
	System.out.println();
     }   

        
  }
}