import java.util.*;
public class Abundant{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(sum>num){
			System.out.println("Abundant number");
		}else{
			System.out.println("Not Abundant number");
		}
	}
}