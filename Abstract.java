class Main
{
   public static void main(String[] args)
   {
     Child pc=new Child();
     System.out.println(pc.add()+" " +pc.div()+" "+pc.mod()+" "+pc.mul()+" "+pc.sub());
   }
}
class Child extends Parent
{
   int x;
   int y;
  public  Child()
   {
     x=10;
     y=20;
   }
    @Override
   public int add()
   {
      return x+y;
   }
   public int div()
   {
     return x/y;
   }
   public int mod()
   {
      return x%y;
   }
}
abstract class Parent
{
     int a,b;
   public Parent()
    {
      a=20;
      b=30;
    }
    public abstract int add();
    public int sub()
    {
       return a+b;
    }
    public int mul()
    {
      return a*b;
    }
}
     

