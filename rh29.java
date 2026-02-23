// Comstructor example

class Bank
{
   private int accno;
   private String holdername;
   private double balance;

    public Bank(int accno, String holdername, double balance)
    {

         this.accno=accno;
          this.holdername=holdername;
          this.balance=balance;
     }

     public void setHolderName(String holdername)
     {
         this.holdername=holdername;
      }

      public int getAccNo()
      {
        return accno;
       }
      public String getName()
      {
        return holdername;
       }
       public double getBalance()
      {
        return balance;
       }
      

      

      

  }



public class rh29
{
  public static void main(String[] args)
   {
   
      Bank bank = new Bank(12345,"Harshi",475784);
      bank.setHolderName("Roopa");
      System.out.println("User details: ");
      System.out.println("Account Number: "+bank.getAccNo()+" "+"Name: "+bank.getName()+" "+"Balance: "+bank.getBalance());
   }
}
 









//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//output:
//User details:
//Account Number: 12345 Name: Roopa Balance: 475784.0

