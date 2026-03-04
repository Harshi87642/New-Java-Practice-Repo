// printing only the even numbers in the ArrayList

import java.util.ArrayList;
 
public class rh47
{
 public static void main(String[] args)
  {

   ArrayList<Integer> list = new ArrayList<>();

  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(6);
  list.add(7);
  list.add(8);
  list.add(9);
  list.add(10);
  list.add(11);

  for(int i=0; i<list.size(); i++)
  {
      if(list.get(i)%2==0)
      {  
          System.out.println(list.get(i));
      }
  }
}
}



//OUTPUT:
//2
//4
//6
//8
//10



