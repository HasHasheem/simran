class Instagram
{
void phone()
{
System.out.println("my new smartphone");
}
}
class Vpn extends Instagram
{
void phone()
{
System.out.println("On the video player");
}
}
class Reels extends Instagram
{
void phone()
{
System.out.println("The reels is so super");
}
}
class Text extends Instagram
{
void phone()
{
System.out.println("I text with my girl friend");
}
}
class Phone
{
static void cell(Instagram i1)
{
i1.phone();
}
}
class Main
{
public static void main(String[]args)
{
Vpn v1=new Vpn();
Reels r1=new Reels();
Text t1=new Text();
Phone.cell(v1);
Phone.cell(r1);
Phone.cell(t1);
}
}

