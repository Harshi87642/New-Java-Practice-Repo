// Insert and delete in stringbuilder

public class rh18
{
  public static void main(String[] args)
   {
  
       StringBuilder sb = new StringBuilder("Hi Harshitha");
   
       sb.insert(14,"!");
    
        System.out.println(sb);
  
        sb.delete(sb.length()-1, sb.length());

        System.out.println(sb);
    }
}






````````````````````````````````````````````````````````````````

OUTPUT:
Hi Harshitha!
Hi Harshitha
