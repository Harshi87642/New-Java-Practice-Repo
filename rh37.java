// using this() keyword in both the classes


class A
{
   public A()
   {
      this(5);
      System.out.println("in A");
   }
   public A(int n)
   {
     super();
      System.out.println("in A int");
    }
}

class B extends A
{
   public B()
    {
      super();
      System.out.println("in B");
    }
   public B(int n)
   {
     this(2,4);
      System.out.println("in B int");
    }
    public B(int x, int y)
    {
      super();
      System.out.println("int B int int");
     }
}

public class rh37
{
   public static void main(String[] args)
    {

        B obj = new B(5);
     
     }
}








//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//o|p:
//in A int
//in A
//int B int int
//in B int
