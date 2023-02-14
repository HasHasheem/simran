class Swiggy
{
static void Select_pizza()
{
place_order("veg_burst");
}
static void place_order(String pizza)
{
System.out.println("order placed Successfully"+pizza);
}
static void pizza(String pizzatype);
{
System.out.println(pizzatype);
}
static String cook(String pizzacook)
{
System.out.println("pizza is ready and getting and dispatch");
return pizzacook;
}
public static void main(String[]args)
{
Select_pizza();
}
} 