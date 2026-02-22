//Encapsulation

class Human
{
   private int age=12;
    private String name="Harshi";

    public int getAge()
    {
      return age;
    }
    public String getName()
     {
       return name;
      }
 
}

public class rh23
{
   public static void main(String[] args)
    {

       Human h = new Human();
     
       System.out.println("Name: "+h.getName()+" " + "Age: "+h.getAge());
     }
}