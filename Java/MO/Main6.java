class Movie
{
static void disp(int no)
{
System.out.println("Duration time"+no);
}
static void disp(char type)
{
System.out.println("Movie cateogery"+type);
}
static void disp(int no,char type)
{
System.out.println("Duration time"+no+"Movie cateogery"+type);
}
static void disp(char type,int no)
{
System.out.println("Movie cateogery"+type+"Duration time"+no);
}
}
class Main6
{
public static void main(String[]args)
{
Movie.disp(3);
Movie.disp('U');
Movie.disp(3,'V');
Movie.disp('B',3);
}
}
