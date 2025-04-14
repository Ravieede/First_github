//2nd table printing
class AllMix
{
  public static void main(String[] args)
  {
    int start=1,end=10,table=2,product=1,sum=0,last=0,product1=1,num1=0,num2=0;
    while(start<=end)
    {
        {
         sum+=start;//sum
        }
        {
          product*=start;//product
        }
        {
          int num=start;
          last=num%10;
          System.out.println(last+" is the last digit of "+num);//lastdigit
        }
        {
          product1=table*start;
          System.out.println(table+" x "+start+" = "+product1);//table
        }
         {
           num1=start;
           int res=(int)Math.sqrt(num1);
           System.out.println(res+" is the square root of "+num1);
         }
         {
           num2=start;
           if(num2%2==0)
           System.out.println(num2+" is even number");
         }
          start++;
      }
         System.out.println(sum);
         System.out.println(product);
    }
  }
      

    
       