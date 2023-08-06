package gettersetters;
//you can automatically generate getters-setters by right click -> Source -> Generate Getters Setters
public class GettersSetters 
{
	public static void main(String[] args) 
	{	
		A a = new A();
		
		a.display();
		a.setNumber(50);
		a.setName("hi");
		
		System.out.println(a.getNumber());
		System.out.println(a.getName());
	}
}

class A
{
	private int number = 100;
	private String name = "hello";
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Initial values:   "+number+"\t"+name);
	}	
}