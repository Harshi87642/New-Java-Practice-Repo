class RBI
{
//final method:SBI cannot override
public final void kycRules()
{
System.out.println("Complete KYC as per RBI guidelines");
}
}
class HDFC_Bank extends RBI{
//Cannot override final KYC method
//@override
//public void kycRules(){}//This method cause a comile-time-error
}
//Main class to test
public class rh66
{
public static void main(String[] args)
{
HDFC_Bank obj=new HDFC_Bank();
//Calling RBI rules
obj.kycRules();
}
}