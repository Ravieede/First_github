//Right Angle Trinagle
class pattern_Right_Triangle
{
  public static void main(String[] args)
  {
     int row=5;
    for(int r=1;r<=row;r++)
    {
       for(int c=row;c>=r;c--)
       {
           System.out.print("# ");
       }
       System.out.println();
    }
     for(int r=1;r<=row;r++)
    {
       for(int c=1;c<=r;c++)
       {
           System.out.print("# ");
       }
       System.out.println();
    }

    System.out.println("___________");
    for(int r=1;r<=row;r++)
    {
       for(int c=row;c>=r;c--)
         {
           if(r==1||r==c||c==row)
	    { 
             System.out.print("# ");
	    }
           else
            System.out.print(" "+" ");
        }
       System.out.println();
    }
     for(int r=1;r<=row;r++)
    {
       for(int c=1;c<=r;c++)
       {
         if(c==1||c==r||r==row)
           System.out.print("# ");
         else
           System.out.print(" "+" ");
       }
       System.out.println();
    }
 
     System.out.println("_____________");
      for(int r=1;r<=row;r++)
    {
       for(int c=1;c<=r;c++)
       {
         if(c==1||r==c)
           System.out.print("# ");
         else
           System.out.print(" ");
       }
       System.out.println();
    }
     for(int r=2;r<=row;r++)
    {
       for(int c=row;c>=r;c--)
       {
         if(r==c||c==row)
           System.out.print("# ");
         else
           System.out.print(" ");
       }
       System.out.println();
    }
 
    System.out.println("____________");
      for(int r=1;r<=row;r++)
    {
       for(int c=1;c<=r;c++)
       {
           System.out.print("# ");
       }
       System.out.println();
    }
     for(int r=2;r<=row;r++)
    {
       for(int c=row;c>=r;c--)
       {
           System.out.print("# ");
       }
       System.out.println();
    }
   
   System.out.println("_________________");
   for(int r=1;r<=row;r++)
   {
      for(int c=row;c>=r;c--)
      {
         System.out.print("$ ");
      }
      for(int c=1;c<=r;c++)
      {
        System.out.print("# ");
      }
     System.out.println();
   }
    
    System.out.println("_________________");
   for(int r=1;r<=row;r++)
   {
       for(int c=1;c<=r;c++)
      {
         System.out.print("# ");
      }
      for(int c=row;c>=r;c--)
      {
        System.out.print("$ ");
      }
     System.out.println();
   }


    System.out.println("_________________");
     System.out.println("Holo pattern:");
   for(int r=1;r<=row;r++)
   {
      for(int c=row;c>=r;c--)
      {
         System.out.print("- ");
      }
      for(int c=1;c<=r;c++)
      {
         if(r==row||c==r||c==1)
        {
          System.out.print("# ");
        }
        else
            System.out.print("  ");
      }
     System.out.println();
   }

    System.out.println("_________________");
   for(int r=1;r<=row;r++)
   {
      for(int c=row;c>r;c--)
      {
         System.out.print("  ");
      }
      for(int c=1;c<=r;c++)
      {
        System.out.print("# ");
      }
     System.out.println();
   }

    System.out.println("_________________");
    System.out.println("Daimond Shape:");
   for(int r=1;r<=row;r++)
   {
     for(int c=row;c>r;c--)
      {
         System.out.print("  ");
      }
      for(int c=1;c<r;c++)
      {
        System.out.print(" #  ");
      }
     System.out.println();
   }
    for(int r=2;r<=row;r++)
    {
      for(int c=1;c<r;c++)
      {
         System.out.print("  ");
      }
      for(int c=row;c>r;c--)
      {
        System.out.print(" #  ");
      }
     System.out.println();
    }
  }
}