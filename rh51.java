// Finding the minimum value in the arraylist

import java.util.ArrayList;
 
public class rh51
{
   public static void main(String[] args)
   {

    
    ArrayList<Integer> list = new ArrayList<>();

     list.add(40);
     list.add(50);
     list.add(100);
     list.add(160);
  
      int max=list.get(0);



      for(int i=0; i<list.size(); i++)
      {
         if(list.get(i)< max)
         {
            max=list.get(i);
         }
      }

     System.out.println("the minimum number is: " + max);
   }
}




//OUTPUT:
//the minimum number is: 40
