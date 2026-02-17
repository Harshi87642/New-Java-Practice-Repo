// Jagged array

public class rh06
{
  public static void main(String[] args)
   {
 
      int num[][] = new int[3][];

      num[0]=new int[4];
      num[1]=new int[3];
      num[2]=new int[2];

    for(int i=0;i<num.length;i++)
    {
        for(int j=0;j<num[i].length;j++)
         {
           num[i][j]=(int)(Math.random()*10);
         }
    }

    for(int i=0;i<num.length;i++)
    {
        for(int j=0;j<num[i].length;j++)
         {
           System.out.println(num[i][j]+" ");
         }
    }
 }
}






``````````````````````````````````````````````````````````````````````````````````
OUTPUT:
8 5 7 1
2 3 5
2 7



