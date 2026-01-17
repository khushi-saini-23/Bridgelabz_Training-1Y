import java.util.*;
public class Triangle{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of height");
		double height=sc.nextDouble();
		System.out.println("enter the value of base");
		double base=sc.nextDouble();
		double area=0.5*base*height;
		System.out.println(area);
	}
}