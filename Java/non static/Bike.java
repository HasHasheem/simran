class Bike
{
int bikecost;
static String bikebrand="hero";
String bikecolor;
public static void main(String[]args)
{
System.out.println(bikebrand);
Bike s1=new Bike();
s1.bikecost=700000;
System.out.println(s1.bikecost);
Bike s2=new Bike();
s2.bikecolor="blue";
System.out.println(s2.bikecolor);
s1.bikecost=70;
System.out.println(s1.bikecost);
}
}
