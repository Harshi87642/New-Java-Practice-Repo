// Selection Sort


public class rh76
{
  public static void main(String[] args)
  {

    int arr[] = {78,65,89,55,92};
    int n= arr.length;

    for(int i=0; i<n-1; i++)
    {
        int minIndex=i;
        for(int j=i+1; j<n;j++)
        {
             if(arr[] < arr[minIndex])
             {
                 minIndex = j;
             }
          }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

 System.out.println("Sorted marks: ");

 for(int i=0; i<n; i++)
 {
    System.out.println(arr[i] + " ");
  }
}
}