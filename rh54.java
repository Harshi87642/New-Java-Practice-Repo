//count how many even numbers exist

import java.util.ArrayList;
import java.util.Arrays;

public class rh54
{
 public static void main(String[] args)
 {

   ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80));

  int count=0;

  for(int i=0;i<list.size();i++)
  {
    if(list.get(i)%2==0)
    {
      count++;
    }
   }

System.out.println("the total number of even numbers present are:" +count);
 
 }
}

   