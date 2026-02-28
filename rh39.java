import java.util.ArrayList;


class Student
{
   // it is not a good practice of using public for variables

   public String name;
   public int id;

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


public class rh39
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
  

    // Modification by index

    list.get(0).name="Ramu";

    // Modification when we don't know index value

    for(Student s:list)
    {
      if(s.id==2)
      {
         s.name="Harshi ma";
      }
   }
     
   // Printing

    for(Student stud : list)
    {
        stud.display();
    }
 }
}








//output:
//Harshi ma 2
//Chinnu 3
//Roopa 4
//Prameela 5