// Concept of Method overloading

class Calculator
{
   public int add(int n1, int n2)
   {
      return n1+n2;
   }
    public int add(int n1, int n2, int n3)
   {
      return n1+n2+n3;
   }
    public double add(double n1, int n2)
   {
      return n1+n2;
   }
}

public class rh03
{
  public static void main(String[] args)
   {
 
      Calculator c=new Calculator();
    
      int r1=c.add(4,5);
       int r2=c.add(4,5,6);
       double r3=c.add(2.0,6);
   
     System.out.println(r1);
     System.out.println(r2);
     System.out.println(r3);
    }
}







````````````````````````````````````````````````````````````
OUTPUT:
9
15
8.0
