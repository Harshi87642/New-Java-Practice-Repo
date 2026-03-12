// Interface convept

interface BankLoan
{
  void homeLoan();
  void goldLoan();
}

class HDFC implements BankLoan
{

  public  void homeLoan()
  {
     System.out.println("HDFC Home Loan Interest Rate: 7%");
  }

  public void goldLoan()
  {
   System.out.println("HDFC Gold Loan Interest Rate: 10%");
  }
}

public class rh61
{
  public static void main(String[] args)
  {

    BankLoan hdfc = new HDFC();

    hdfc.homeLoan();
    hdfc.goldLoan();
  }
}



// here we are creating object for child class that is HDFC not parent class.. it nmeans that HDFC is the child class,,,,through HDFC we are implementing parent class
