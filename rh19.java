//  reverse and to String methods

public class rh18
{
  public static void main(String[] args)
  {

       StringBuilder sb = new StringBuilder("Hello");

        // reverse

         sb.reverse();
         System.out.println(sb);


         // converting from string builder to string
          String s= sb.toString();
         System.out.println(s);
     }
}
    




OUTPUT:

olleH
Hello
