class Mob
{
void buy(int no)
{
System.out.println("how much price"+no);
}
void buy(String Ram)
{
System.out.println("The Ram is"+Ram);
}
void buy(int no,String Ram)
{
System.out.println("How much price"+no+"The Ram is"+Ram);
}
void buy(String Ram,int no)
{
System.out.println("The Ram is"+Ram+"How much price"+no);
}
}
class Main2
{
public static void main(String[]args)
{
Mob m1=new Mob();
m1.buy(9000);
m1.buy("4GB");
m1.buy(9000,"4GB");
m1.buy("4GB",9000);
}
}
