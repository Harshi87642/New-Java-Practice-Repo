// Multidimensional Array

public class rh05
{
  public static void main(String[] args)
   {
  
       int num[][] = new int[3][4];

        for(int i=0;i<num.length;i++)
       {
           for(int j=0;j<num[i].length;j++)
             {
                num[i][j] = (int)(Math.random()*10);
                
              }
         }

        

       for(int i=0;i<num.length;i++)
       {
           for(int j=0;j<num[i].length;j++)
             {
                System.out.println(num[i][j] +" ");
              }
         }
     }
}








`````````````````````````````````````````````````````````````````````````````````````

OUTPUT:

8 5 7 1
2 2 5 3
2 7 8 7

                 