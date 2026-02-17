// Array of objects

class Student
{
   int rollno;
    String name;
    int marks;
}
 
public class rh07
{
 public static void main(String[] args)
 {
 
     Student s1 = new Student();
      s1.rollno=001;
      s1.name="Harshi";
      s1.marks=100;

     Student s2 = new Student();
      s2.rollno=002;
      s2.name="Harshitha";
      s2.marks=100;

     Student students[] = new Student[2];
  
     students[0]=s1;
      students[1]=s2;     

    for(Student s : students)
    {
      System.out.println(s.rollno + ":" +s.name+ ":"+s.marks);
    }
   }
}








````````````````````````````````````````````````````````````````````````````````````````````
OUTPUT:
001:Harshi:100
002:Harshitha:100

