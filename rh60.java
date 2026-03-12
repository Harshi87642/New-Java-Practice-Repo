// Abstract Concept

//Abstract  class representing a Franchise
abstract  class Franchise
{
  public void maintainFoodQualityAndSpace()
  {
    System.out.println("Ensure high-quality food is serverd.");
     System.out.println("Maintain minimum 500 sq. ft. space.");
   }
}

class Dominos extends Franchise
{
   public void payment(double amount)
   {
  
     System.out.print("Domino's payment processed using POS or online: $" +amount);
   }
}

//corner House Franchise
class CornerHouse extends Franchise
{
    public void payment(double amount)
     {
         System.out.println("Corner House payment processed via cash, card, or UPI: $"+ amount);
      }
}


public class rh60
{
  public static void main(String[] args)
  {

     Franchise f1 = new Dominos();
     Franchise f2 = new CornerHouse();

    System.out.println();

   // corner House operations
     f1.maintainFoodQualityAndSpace();
    // f2.payment(250.00);
   }
}