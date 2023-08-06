package Bpolymorphism;

public class OverLoading 
{
public static void main(String[] args) 
{
	Color col = new Color();
	col.changeColor();
	col.changeColor(5);
	col.changeColor("pink");
}
}
 class Color
 {
	 public void changeColor()
	 {
		 System.out.println("Black");
	 }
	 public void changeColor(int x)
	 {
		 System.out.println("white");
	 }
	 
	 public void changeColor(String a)
	 {
		 System.out.println(a);
	 }
 }