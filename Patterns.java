//Patterns
class Pattern
{
  public static void main(String[] args)
  {
     int row=5,col=5;

	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=col;c++)
		{
		   System.out.print("# ");
		}
		System.out.println();
	}

        System.out.println("_________________");
	for(int r=1;r<=row;r++)
	{
	  for(int c=1;c<=col;c++)
	  {
		if(r%2==0)
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


     System.out.println("__________________");
    for(int r=1;r<=row;r++)
     {
       for(int c=1;c<=col;c++)
       {
         if(r+c==row+1 ||r==c)
          {
            System.out.print("#"+" ");
          }
	  else
	  System.out.print("$"+" ");
       }
      System.out.println();
    }


   System.out.println("__________________");
   for(int r=1;r<=row;r++)
   { 
    for(int c=1;c<=col;c++)
    {

       if(r==1||c==1||r==row||c==col)
       {
          System.out.print("#"+" ");
       }
        else
        System.out.print("$"+" ");
     }
       System.out.println();
    }

     System.out.println("_________________");
     for(int r=1;r<=row;r++)
	{
	 for(int c=1;c<=col;c++)
	  {
		if(r==1||c==1||r==row||c==col)
		{
			System.out.print("#"+" ");
                }
		else
		System.out.print(" "+" ");
            }
		System.out.println();
	 }
        
         System.out.println("________________");
         for(int r=1;r<=row;r++)
	 {
		for(int c=1;c<=col;c++)
		{
                        if(r==c||r+c==row+1)
			{
				System.out.print(r+"");
			}
			System.out.print(" ");
  		}
         	System.out.println();
	} 

        System.out.println("________________");
	for(int r=1;r<=row;r++)
	{
	  for(int c=1;c<=col;c++)
	  {
	    if(r%2==0&&(r==c||r+c==row+1))
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


	System.out.println("_______________");
	for(int r=1;r<=row;r++)
	{
	  for(int c=1;c<=col;c++)
	  {
		if(r==c||r+c==row+1||r==1||c==1||r==row||c==col)
		{
		   System.out.print("# "+"");
		}
		else
		{
		 System.out.print(" "+" ");
		}
	  }
	  System.out.println();
	}
  
       System.out.println("________________");
	 for(int r=1;r<=row;r++)
	 {
	   for(int c=1;c<=col;c++)
	    {
                if(r==1)
		{
		  System.out.print("# ");
 		}
		 else if(r == 2 || r == 4)
                {
                    if(c % 2 != 0)
		     {
                       System.out.print("$ ");
		     }
                    else
		     {
                       System.out.print("# ");
		     }
		 }
		 else if(r==3)
		    {
			if(c==3)
			  System.out.print("# ");
			else
			  System.out.print("$ ");
		    }
		 else if(r==4)
		    {
			if(c==2||c==3||c==4)
			 System.out.print("$ ");
			 else
				System.out.print("# ");
		    }
		}
		System.out.println();
       	} 

	System.out.println("_______________");
	for(int r=1;r<=row;r++)
	{
	   for(int c=1;c<=col;c++)
	   {
		if(r==1)
		{
			System.out.print("A ");
		}
		else if(r==2)
		{
			System.out.print("B ");
		}
		else if(r==3)
		System.out.print("C ");
		
            }
	   System.out.pr                         