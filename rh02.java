class Computer
{
   public void playmusic()
   {
     System.out.println("Playing music......");
   }
   public String getmeapen(int cost)
   {
    if(cost>=10)
        return "Pen";
     else  
        return "Nothing";
    }
}

public class rh02
{
  public static void main(String[] args)
   {
 
      Computer c=new Computer();

      c.playmusic();
      String str = c.getmeapen(5);
  }
}







`````````````````````````````````````````````````````````````````````
OUTPUT:
Playing music......
Nothing

