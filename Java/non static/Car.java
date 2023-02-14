class Car
{
int car_cost;
static String modelname="jaquar";
String cartype;
public static void main(String[]args)
{
System.out.println(modelname);
Car s1=new Car();
s1.car_cost=1000;
System.out.println(s1.car_cost);
Car s2=new Car();
s2.cartype="ac";
System.out.println(s2.cartype);
s1.car_cost=1;
System.out.println(s1.car_cost);
}
}