class BankAccount
{
  
       private int accontNumber;
       private String holderName;
       private double balance;

      public BankAccount(int accountNumber, String holderNmae, double balance)
      {

            this.accountNumber=accountNumber;
            this.holderName=holderName;
            this.balance=balance;

      }

      public double getBalance()
      {
             return balance;
       }
       public void setHolderName(String holdername)
       {
            this.holderName=holderName;
        }

        public double deposite(int amount)
        {
      
            balance=+amount;
         }
         public double withdrawl(int amount)
        {
             if(amount <= balance)
                   balance=-amount;
              else
                   Sytsem.out.println("Enter sufficient value");
         }
}


public class rh21
{
    public static void main(String args[])
     {
        BankAccount ba = new BankAccount(101, "Roopa",5000.0);
     
        // ba.getbalance();
         System.out.println("Initial Balance = "+ ba.getBalance);
  
          ba.setHolderName("Harshi");
          ba.deposit(1000.0);
          System.out.println("Balance after 1000: "+ba.getBalance);
          ba.withdrawl(500);
          System.out.println("Balance after withdrawl: "+ba.getBalance);


     }
}
          
 



         


      

      