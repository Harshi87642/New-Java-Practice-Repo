// Overrinding Concept

class Calc
{
   public int add(int n1,int n2)
   {
      return n1+n2;
   }
}

class AdvCalc extends Calc
{
   public int add(int n1, int n2)
   {
     return n1+n2+n1;
    }
}


public class rh42
{
  public static void main(String[] args)
   {
      AdvCalc obj = new AdvCalc();
      int r1=obj.add(2,3);
      System.out.println(r1);
    }
}







//output:
//7