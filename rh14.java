// Extracting username  and parsing skills

public class rh14
{
  public static void main(String[] args)
   {
  
     String email = "harshitha@gmail.com";
  
    String  skillsinput = "JAVA,SQL,UIUX";

      //extracting user name using email using substring

     String username=email.substring(0,indexOf("@"))
     
       System.out.println("C"+username);

     // split-> parse skills

   String[] skills = skillsinput.spilt(",");

     System.out.println("Skills: ");
     for(String s : skills)
     {
        System.out.println("- "+s);
     }
   }
}





`````````````````````````````````````````````````````````````````````````````````````````````````````````

OUTPUT:

Username : harshitha
Skills: 
- JAVA
- SQL
- UIUX






   
     
     