// super() method
//lets say i want to print default constructor in both the class A and B


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
      super();
      System.out.println("in B");
    }
   public B(int n)
   {
     super();
      System.out.println("in B int");
    }
}

public class rh31
{
   public static void main(String[] args)
    {

        B obj = new B();
        // like we are calling default constructor in B and calls default constructor in A
     }
}




//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//o|p:
//in A
//in B