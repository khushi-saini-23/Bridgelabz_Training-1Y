import java.util.*;
public class Power{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("enter positive");
		int power=sc.nextInt();
		if(power<0){
			System.out.println("power must be positive");
		}
		int result=1;
		for(int i=1;i<=power;i++){
			result*=num;
		}
		System.out.println(num+" raised power "+power+" is "+result);
	}
}