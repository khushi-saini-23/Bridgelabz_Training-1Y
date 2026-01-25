import java.util.*;
public class Fizzbuzz{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		if(n<=0){
			System.out.println("plz enter the positive number");
		}else{
			while(i<=num){
				if(num%3==0 && num%5==0){
					System.out.println("fizzbuzz");
				}else if(num%3==0){
					System.out.println("fizz");
				}else if(num%5==0){
					System.out.println("buzz");
				}else{
					System.out.println(i);
				}
			    i++;
			}
		}
	}
}