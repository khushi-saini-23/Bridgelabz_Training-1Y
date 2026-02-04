import java.util.*;
public class Month{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int date=sc.nextInt();
	    if((month==3) && (date==20)||(month== 6)&& (date==20)){
			System.out.println("its Spring");
		}else{
			System.out.print("its not spring");
		}
	}
}
		