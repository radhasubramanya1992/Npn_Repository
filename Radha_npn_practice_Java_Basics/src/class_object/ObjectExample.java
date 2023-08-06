package class_object;

public class ObjectExample 
{
public static void main(String[] args) {
	ClassExample cObj = new ClassExample();
	
    System.out.println("color   weight   height   "+cObj.color+"\t"+cObj.weight+"\t"+cObj.height);
    cObj.getColor("Brown");
    cObj.getHeight(3.5);
    cObj.getWeight(20);    
}
}
