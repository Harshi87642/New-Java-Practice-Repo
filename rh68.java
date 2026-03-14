//  Concept of O(n) and O(n^2)

public class rh68 { 
   // linear Search: Method 1
    public static int linearSearch(int n, int k)
    {

        int steps = 0;
         for(int i=1; i<=n; i++)
         {
            steps++;
             if(i==k) break; //book found
         }
       return steps;
    }

 public static int binarySearch(int n, int k)
 {
       int steps =0;
        int left =1;   // starting point
        int right = n; //  ending point

      while(left <= right)
      {
          steps++;
          int mid = (left+right)/2;
          if(mid == k) break;
          else if(mid < k)
          {
             left = mid+1;
          }
          else
          {
             right = mid-1;
          }
      }
  return steps;
 }
// usually for binary its O(log n) and should be in sorted order
public  static void main(String[] args)
{

    int n=100; //total books
     int k = 73;  //book position to find

     int linearSteps = linearSearch(n,k);
      int binarySteps = binarySearch(n,k);

    System.out.println("Library Search Comparison");
    System.out.println("---------------------");
    System.out.println("Total books: " +n);
    System.out.println("Book to find: " +k);
    System.out.println();

    System.out.println("Method 1(Linear Search) steps: " +linearSteps);
    System.out.println("Time Complexity: O(n)");
    System.out.println();

    System.out.println("Method 2(Binary Search) steps: " +binarySteps);
    System.out.println("Time Complexity: O(logn)");
  }
}
    

    


// OUTPUT:
//Library Search Comparison
//---------------------
//Total books: 100
//Book to find: 73

//Method 1(Linear Search) steps: 73
//Time Complexity: O(n)

//Method 2(Binary Search) steps: 6
//Time Complexity: O(logn)

         












