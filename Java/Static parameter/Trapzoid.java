class Trap
{
static void area(int a,int b,int h)
{
double area=0.5*a+b*h;
System.out.println(area);
}
}
class Trapzoid
{
public static void main(String[]args)
{
Trap.area(2,2,5);
}
}