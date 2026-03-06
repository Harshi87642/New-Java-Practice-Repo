//Remove element at specific index

import java.util.ArrayList;
import java.util.Arrays;

public class rh56
{
 public static void main(String[] args)
  {

   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,13,14,15,16,17,18,19,12,12,13,12));

  
   list.remove(8);
 
   System.out.println("list after updating: "+list);
 }
}






//OUTPUT:
//list after updating: [10, 11, 12, 13, 14, 15, 16, 17, 19, 12, 12, 13, 12]