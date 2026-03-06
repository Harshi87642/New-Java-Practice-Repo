//check if the number exists in the arraylist or not

import java.util.ArrayList;

public  class rh52
{
  public static void main(String[] args)
  {

    ArrayList<Integer> list = new ArrayList<>();

    list.add(200);
    list.add(300);
    list.add(400);
    list.add(450);
    list.add(500);


   list.contains(450);

   System.out.println("Is 450 present??? " + list.contains(450));
  }
}



//OUTPUT:

//Is 450 present??? true