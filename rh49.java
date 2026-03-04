// Find the sum of all elements in the ArrayList

import java.util.ArrayList;
  
public class rh49
{
  public static void main(String[] args)
  {
    int result=0;

    ArrayList<Integer> list = new ArrayList<>();

       list.add(23);
       list.add(33);
       list.add(32);
        list.add(53);
        list.add(83);
         list.add(73);

         list.add(63);

      for(int i=0; i<list.size(); i++)
      {
         result += list.get(i);
      }
      System.out.println("the sum of all numberrs in teh array= " + result);
   }
}
         





//OUTPUT:
//the sum of all numberrs in teh array= 360
     