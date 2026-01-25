import java.util.*;
public class Evenodd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++){
				if(i%2==0){
					System.out.println("EVEN");
				}else{
					System.out.println("ODD");
				}
			}
		}
		else{
			System.out.println("enter the postive number");
		}
	}
}
		