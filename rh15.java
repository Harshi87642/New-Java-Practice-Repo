// normalized email  and initial extraction

public class rh15
{
  public static void main(String[] args)
  {
 
    String email = "harshitha@gmail.com";
    String name =  "Harshitha";

     // toLowerCase
  
     email = email.toLowerCase();
     System.out.println("Normalized email: "+email);

     // extraction of Initial character

     char initial = name.charAt(0);
     System.out.println("Initial: "+initial);
  }
}






``````````````````````````````````````````````````````````````````````````

OUTPUT:
Normalized email: harshitha@gmail.com
Initial: H

  