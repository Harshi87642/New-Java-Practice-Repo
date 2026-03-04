// Problem sttatement : Store 10 integers in ArrayList and print only even numbers

import java.util.ArrayList;

public class rh44
{
  public static void main(String[] args)
  {

     ArrayList<Integer> numbers = new ArrayList<>();

     numbers.add(1);
     numbers.add(2);
     numbers.add(3);
     numbers.add(4);
     numbers.add(5);
     numbers.add(6);
     numbers.add(7);
     numbers.add(8);
     numbers.add(9);
     numbers.add(10);


     // For priniting

     for(int i=0; i<numbers.size(); i++)
      {
         if(numbers.get(i)%2 == 0)
         {
           System.out.println(numbers.get(i));
          }
      }
}
}

      