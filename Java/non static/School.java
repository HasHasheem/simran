class School
{
static String schoolname="RJ";
char Schoolgrade;
int Schoolstrength;
public static void main(String[]args)
{
System.out.println(schoolname);
School s1=new School();
s1.Schoolgrade='A';
System.out.println(s1.Schoolgrade);
School s2=new School();
s2.Schoolstrength=200;
System.out.println(s2.Schoolstrength);
s1. Schoolgrade='B';
System.out.println(s1.Schoolgrade);
}
}