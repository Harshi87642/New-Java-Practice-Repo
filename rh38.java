// ArrayList Concepts

import java.util.ArrayList;


class Student
{
   private String name;
   private int id;

  public Student(String name, int id)
  {
      this.name=name;
      this.id=id;
  }

  public void display()
  {
     System.out.println(name+" "+id);
  }
}


public class rh38
{
  public static void main(String[] args)
  {
    
     ArrayList<Student> list = new ArrayList<>();
    
    list.add(new Student("Ram",1));
    list.add(new Student("Harshi",2));
    list.add(new Student("Chinnu",3));
    list.add(new Student("Roopa",4));
    list.add(new Student("Prameela",5));


    // remoing by index

    list.remove(0);
  
   // Printing

    for(Student stud : list)
    {
        stud.display();
    }
 }
}










//OUTPUT:
//Harshi 2
//Chinnu 3
//Roopa 4
//Prameela 5

   