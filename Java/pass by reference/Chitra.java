class Boost
{
void tea()
{
System.out.println("feel the nature");
}
}
class Chitra
{
public static void main(String[]args)
{
Boost b1=new Boost();
Customer.needboost(b1);
}
}
class Customer
{
static void needboost(Boost b2)
{
b2.tea();
}
}
