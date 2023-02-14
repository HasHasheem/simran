class Sample
{
static double area(int r)
{
final double pi=3.142;
double result=pi*r*r;
return result;
}
public static void main(String[]args)
{
double x=area(4);
System.out.println(x);
}
}