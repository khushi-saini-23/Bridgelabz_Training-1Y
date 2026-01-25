import java.util.*;
public class Power2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("enter positive");
		int power=sc.nextInt();
		if(power<0){
			System.out.println("power must be positive");
		}
		int result=1;
		while(i<=power){
			result*=num;
			i++;
		}
		System.out.println(num+" raised power "+power+" is "+result);
	}
}