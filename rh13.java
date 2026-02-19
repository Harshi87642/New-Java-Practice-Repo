// Checking email validation and user or admin login

public class rh13
{
  public static void main(String[] args)
  {
 
     String email = "harshitha@gmail.com";
    
      String role = "User";
      
       //checking email validation using contains("@")

        if(email.contains("@"))
        {
          System.out.println("Valid Email");
       }
        else
        {
          System.out.println("Invalid Email");
         }

      // checking role using equals(User)

       if(role.equals("User")
        {
           System.out.println("User login");
         }
        else
         {
           System.out.println("Admin login");
          }
      }
}










OUTPUT:
Valid Email
User login



