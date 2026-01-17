import java.util.*;
public class Power{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the base");
		int base=sc.nextInt();
		System.out.println("enter the exp");
		int exp=sc.nextInt();
		double power=Math.pow(base,exp);
		System.out.println("the power is: "+power);
	}
}
	