// Constructor


class Admission
{
   
     private String name;
     private String USN;
     private String course;
 
     public Admission(String name, String USN, String course)
     {
       
          this.name=name;
          this.USN=USN;
          this.course=course;
      }

     public void setCourse(String course)
      {
          this.course=course;
       }

      public String getDetails()
      {
           return name+" "+USN+" "+course;
       }
}



public class rh28
{
  public static void main(String args[])
   {
      Admission ad=new Admission("Harshitha", "1AT101","ISE");
      
      ad.setCourse("CSE");
     
       System.out.println("Details of the student is: "+ad.getDetails());
    }
}









//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
//output:
//Details of the student is: Harshitha 1AT101 CSE