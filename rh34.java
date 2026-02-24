// this() key
// when i wanted to execute all the methods in the class and default in class A is called automatically

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
     this();
      System.out.println("in B int");
    }
}

public class rh34
{
   public static void main(String[] args)
    {

        B obj = new B(5);
        // like we are calling default constructor in B and calls default constructor in A
     }
}









//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//o|p:
//in A
//in B
//in B int


