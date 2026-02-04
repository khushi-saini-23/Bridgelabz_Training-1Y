import java.util.*;
public class Calculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double first=sc.nextDouble();
		System.out.println("enter operator(+,-,*,/,)");
		String op=sc.next();
		System.out.println("enter the second number");
		double second=sc.nextDouble();
		double result;
		switch(op){
			case "+":
			result=first+second;
			System.out.println("result="+result);
			break;
		
			case"-":
			result=first-second;
			System.out.println("Result="+result);
			break;
		    case"*":
			result=first+second;
			System.out.println("result="+result);
			break;
			case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
	}
}
			
			