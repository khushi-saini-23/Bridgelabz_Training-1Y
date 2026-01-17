import java.util.*;
public class Height{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your height in cm");
		float height=sc.nextFloat();
		double inch=height/2.54;
		double feet=height/30.48;
		System.out.println("the height into cm to feet"+feet+"and the inch is"+inch);
	}
}
		