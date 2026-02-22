// Getters and setters

class Human
{
  
     private int age;
     private String name;

      public int getAge()
      {
          return age;
      }
 
      public void setAge(int a)
      {
         age=a;
      }

      public String getName()
      {
          return name;
      }
 
      public void setName(String n)
      {
         name=n;
      }
}

public class rh24
{
   public static void main(String[] args)
    {
 
       Human h = new Human();

        h.setAge(12);
        h.setName("harshi");

        System.out.println("Name: "+ h.getName()+ " "+ "Age: "+h.getAge());
    }
}






//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//O|P:
//Name: harshi Age: 12




       
