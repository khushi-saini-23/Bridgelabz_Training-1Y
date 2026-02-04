import java.util.*;
public class Bones{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		System.out.println("enter the year");
		int year=sc.nextInt();
		if(year>5){
			System.out.println("you will get bones");
			int bones=salary*5/100;
			System.out.println(bones);
		}
		else{
			System.out.println("after completion of 5 years");
		}
	}
}	
	
		