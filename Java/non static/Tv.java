class Tv
{
int tvcost;
static String tvbrand="mi";
String tvtype;
public static void main(String[]args)
{
System.out.println(tvbrand);
Tv s1=new Tv();
s1.tvcost=12000;
System.out.println(s1.tvcost);
Tv s2=new Tv();
s2.tvtype="led";
System.out.println(s2.tvtype);
s1.tvcost=11000;
System.out.println(s1.tvcost);
}
}