public class rh67
{
  public static void main(String[] args)
  {

     int n=5;
     int countA = 0; //Operation A counter
     int countB = 0; //Operation B counter
     int countC = 0; //Operation C counter


    //Operation A: print total count

    System.out.println("Operation A: Total Packages =" +n);
    countA++;  //runs once

    System.out.println("Operation A ran" + countA + "time(s)");
    System.out.println("Time complexity: O(1)");
    System.out.println("--------------------------------");

    //Operation B: print each package number from 1 to n

    System.out.println("Operation B: Package numbers 1 to" + n);
    for(int i=1; i<=n;i++)
     {
        System.out.println("Package " +i);
        countB++;  //increment counter for each print
     }

    System.out.println("Opration B ran " + countB + "time(s)");
    System.out.println("-----------------------------");


   //Operation C: print every pai of package numbers

     System.out.println("Operation C: Every pair of packages");
     for(int i=1; i<=n ; i++)
     {
       for(int j=1;j<=n; j++)
       {
           System.out.println("(" +i+ ", "+j+")");
           countC++; //increment counter of each pair
        }
     }

     System.out.println("Operation C ran " + countC + "time(s)");
     System.out.println("Time Complexity: O(n^2)");
   }
} 