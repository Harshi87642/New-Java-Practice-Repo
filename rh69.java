// O(n) and O(n^2)

public class rh69
{
  public static void main(String[] args)
  {
    
    // Example Student scores
    int[] scores = {35,50,70,40,60,30,50};

     int n = scores.length;

    //Task 1: Count students Passed(score>=40)

    int passCount = 0;
    int comparisonsTask1 =0;

     for(int i=0; i<=n; i++)
     {
         comparisonTask1++;
         if(scores[i] >=40)
         {
           passCount++;
          }
      }
   
System.out.println("Task1: Count of students passed(score >=40)");
System.out.println("Passed students: " +passCount);
System.out.println("Comaprison made:" + comparisonTask1);
System.out.println("Time Complexity: O(n)");
System.out.println("-------------------");



//Task 2: Find all pairs with combined score =100



int pairCount=0;
int comparisonTask2 =0;

System.out.println("Task 2: pairs of students whose sum = 100");
for(int i=0; i<n; i++)
{
  for(int j=i+1; j<n; j++)
  {
     comparisonTask2++;
      if(scores[i] + scores[j] == 100)
      {
         pairCount++;
         System.out.println("Pair:(" + scores[i]+ ","+scores[j]+ ")");
       }
   }
}

System.out.println("Total pairs found: " + pairCount);
System.out.println("Comparison made: " +comparisonTask2);
System.out.println("Time Complexity: O(n^2)");
}
}