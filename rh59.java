// Overriding Concept

class BankPayment
{
  public void pay(double amount)
  {

     System.out.println("Processing generic payment of $ " +amount);
  }
}

//Child class: credit Card Payment

 class CreditCardPayment extends BankPayment
 {
    @Override
    public void pay(double amount)
     {
       System.out.println("Processing CreditCard payment of $ "+amount);
     }
  }
 
class UPIPayment extends BankPayment
 {
    @Override
    public void pay(double amount)
     {
       System.out.println("Processing UPIPayment payment of $ "+amount);
     }
  }

public class rh59
{
  public static void main(String[] args)
  {
 
     BankPayment  payment;
   
       //pay using Credit Crad
      payment = new CreditCardPayment();
      payment.pay(5000.00);
  
      //pay using UPI
      payment = new UPIPayment();
      payment.pay(3000.00);
   }
}

