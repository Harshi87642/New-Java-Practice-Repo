// super() keyword concept only
// lets say i want to print both the parameterized comstructors

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
     super(n);
      System.out.println("in B int");
    }
}

public class rh33
{
   public static void main(String[] args)
    {

        B obj = new B(5);
        // like we are calling default constructor in B and calls default constructor in A
     }
}







//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//o|p:
//in A int
//in B int

 