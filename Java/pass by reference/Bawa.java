class Medicine
{
void product()
{
System.out.println("Dolo 650");
}
}
class Bawa
{
public static void main(String[]args)
{
Medicine m1=new Medicine();
Customer.needproduct(m1);
}
}
class Customer
{
static void needproduct(Medicine m2)
{
m2.product();
}
}
