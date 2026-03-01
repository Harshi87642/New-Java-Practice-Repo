// Method Overriding

class A
{
   public  void show()
   {
      System.out.println("in A show");
   }
    public void config()
   {
     System.out.println("in A config");
    }
}
class B extends A
{
   public void show()
   {
     System.out.println("in B show");
    }
}


public class rh41
{
  public static void main(String[] args)
  {

    B obj = new B();
    obj.show();
    obj.config();
  }
}









//output:
//in B show
//in A config
    
   
      