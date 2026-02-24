// super() keyword concept
// lets say i want to print parameterized constructor of class A and default constructor of class B

class A
{
   public A()
   {
      super();
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
      super(5);
      System.out.println("in B");
    }
   public B(int n)
   {
     super();
      System.out.println("in B int");
    }
}

public class rh32
{
   public static void main(String[] args)
    {

        B obj = new B();
        // like we are calling default constructor in B and calls default constructor in A
     }
}








//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//o|p:
//in A int
//in B


 