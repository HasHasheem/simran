class Grocery
{
static void job(int no)
{
System.out.println("how many members working in dunzo"+no);
}
static void job(String veg)
{
System.out.println("The veg is"+veg);
}
static void job(int no,String veg)
{
System.out.println("how many members working in dunzo"+no+"The veg is"+veg);
}
static void job(String veg,int no)
{
System.out.println("The veg is"+veg+"how many members working in dunzo"+no);
}
}
class Main4
{
public static void main(String[]args)
{
Grocery.job(90);
Grocery.job("tcs");
Grocery.job(90,"has");
Grocery.job("has",90);
}
}
