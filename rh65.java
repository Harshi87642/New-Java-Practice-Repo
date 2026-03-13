// Final Keyword

public class rh65
{
  public static void main(String[] args)
  {
   final double PI = 3.14;

   double radius = 5;

    double area = PI* radius*radius;

   System.out.println("Radius : "+radius);
   System.out.println("Area : "+area);

  PI = 3.142;
  }
}








// It should show some error no
//that is
//cannot assign a value to final variable PI
//  PI = 3.142;
 // ^
//1 error