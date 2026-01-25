import java.util.*;
public class Greatest1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int gf=1;
		int count=num-1;
		while(count>=1){
			if(num%count==0){
				gf=count;
				break;
				
			}
			count--;
		}
		System.out.print(gf);
	}
}