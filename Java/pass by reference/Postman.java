class Ps
{
void need_letters()
{
System.out.println("collectletters");
}
}
class Postman
{
public static void main(String[]args)
{
Ps p1=new Ps();
Customer1.need_letters(p1);
}
}
class Customer1
{
static void need_letters(Ps p2)
{
p2.need_letters();
}
}
