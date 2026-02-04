import java.util.*;
public class Harshed{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(temp>0){
			sum=sum+(temp%10);
			temp=temp/10;
		}
		if(num%sum==0){
			System.out.println("harshed number");
		}else{
			System.out.println("not a harshed number");
		}
	}
}
