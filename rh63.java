//without catch block
class rh63
{
 public static void main(String[] args)
  {
 
     int a=10, ans=0;

    try
    {
       ans=a/0;
    }
         finally
     {
        System.out.println("I am from finally block");
     }
 }
}
  