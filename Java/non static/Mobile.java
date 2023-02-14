class Mobile
{
int mobile_cost;
static String mobile_model_name="Samsung";
String mobile_color;
public static void main(String[]args)
{
System.out.println(mobile_model_name);
Mobile s1=new Mobile();
s1.mobile_cost=20000;
System.out.println(s1.mobile_cost);
Mobile s2=new Mobile();
s2.mobile_color="red";
System.out.println(s2.mobile_color);
s1.mobile_cost=23000;
System.out.println(s1.mobile_cost);
}
}

