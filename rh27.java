// Default and parameterized constructors

class Human
{
 
   private int age;
   private String name;

   public Human()
   {
      age=12;
      name="Harshi";
   }

   public Human(String name, int age)
   {
   
       this.name=name;
       this.age=age;
    }

   public Human(String name)
   {
      this.name=name;
      age=12;
    }
    public Human(int age)
   {
      this.age=age;
      name="kittu";
    }
    
}


public class rh27
{
  public static void main(String[] args)
   {

      Human h = new Human();
      Human h1 = new Human("kannayya", 12);
      Human h2 = new Human("radhe");
      Human h3 = new Human(12);
   }
}
