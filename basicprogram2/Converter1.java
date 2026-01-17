import java.util.*;
public class Converter1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the km");
		double km=sc.nextInt();
		double miles=km*1.6;
		System.out.println("The total miles is"+miles+"miles for the given"+km+"km");
	}
}