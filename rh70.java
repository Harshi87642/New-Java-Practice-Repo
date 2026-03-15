// Recursion

public class rh70
{
  public static int countWays(int n)
   {
 
      if(n==0) return 1; //reached top
      if(n==1) return 1; //only 1 step left


      //Recursion case: 1 steps or 2 steps
       return countWays(n-1)+countWays(n-2);
  }

 public static void main(String[] args)
 {
   int n=3;  //total stairs
   int ways = countWays(n);
   System.out.println("Number of distinct ways:" +ways);
 }
}






//OUTPUT:
//Number of distinct ways:3