// Printing numbers which are graeter than 50

import java.util.ArrayList;

public class rh48
{
  public static void main(String[] args)
  {
 
    ArrayList<Integer> list = new ArrayList<>();

    list.add(20);
     list.add(52);
      list.add(60);
     list.add(70);
      list.add(45);
      list.add(80);
     list.add(70);
      list.add(90);

     for(int i=0; i<list.size();i++)
     {
       if(list.get(i)>50)
       {
          System.out.println(list.get(i));
       }
     }
  }
}




//OUTPUT:
//52
//60
//70
//80
//70
//90