class Student
{
  
    private String name;
    private String usn;
    private String course;


     public Student(String name, String  usn, String course)
     {
        this.name=name;
         setUsn(usn);
        this.course=course;
    }


     public void setUsn(String usn)
     {
        if(usn.length()==10)
           this.usn=usn;
         else
           System.out.println("Invalid USN.......it must be of 10 characters");
      }

      public String getDetails()
      {
         return name+" "+usn+" "+course;
      }

 }
 
 public class rh30
 {
    public static void main(String[] args)
    {
    
       Student st = new Student("Harshi","1AT23IS0","ISE");
       
       System.out.println("Details of the student is: ");
       System.out.println(st.getDetails());
     }
}








//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//output:
// Invalid USN.......it must be of 10 characters
//Details of the student is:
//Harshi null ISE

       
    