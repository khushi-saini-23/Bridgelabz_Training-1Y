import java.util.*;
public class Fizzbuss{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n<=0){
			System.out.println("its is not positive number");
		}else{
			
			for(int i=0;i<=n;i++){
				if(i%3==0 && i%5==0){
					System.out.println("fizzbuzz");
				}else if(i%3==0){
					System.out.println("fizz");
				}else if(i%5==0){
					System.out.println("buzz");
				}else{
					System.out.println(i);
				}
			}
		}
			
	}
}
			