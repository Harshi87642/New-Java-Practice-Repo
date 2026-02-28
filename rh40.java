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
  
  public String getName()
  {
     return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }

  public int getId()
  {
     return id;
  }
  public void setId(int id)
  {
    this.id=id;
  }

  
  public void display()
  {
     System.out.println(name+" "+id);
  }
}


public class rh40
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

    // Modification using index number

    list.get(0).setName("Ramu");
 
    // modification when we don't know the index

    for(Student s : list)
    {
       if(s.getId() == 2)
        {
          s.setName("Harshi ma");
        }
    }
     
  
   // Printing

    for(Student stud : list)
    {
        stud.display();
    }
 }
}










// output:
//Harshi ma 2
//Chinnu 3
//Roopa 4
//Prameela 5

