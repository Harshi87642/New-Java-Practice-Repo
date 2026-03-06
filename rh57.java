//SET ELEMENT WITH ANOTHER VALUE

import java.util.ArrayList;
import java.util.Arrays;

public class rh57
{
 public static void main(String[] args)
  {

   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,13,14,15,16,17,18,19,12,12,13,12));

  
   list.set(12,22);

   System.out.println("After replacing: "+list);
 
  }
}

  


//OUTPUT:
//After replacing: [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 12, 12, 22, 12]