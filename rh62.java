class rh62
{
 public static void main(String[] args)
  {
 
     int a=10, ans=0;

    try
    {
       ans=a/0;
    }
    catch(Exception e)
    {
      System.out.println("Denominator cannot be Zero");
    }
     finally
     {
        System.out.println("I am from finally block");
     }
 }
}
  