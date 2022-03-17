package helloJava;
import java.util.Scanner;

public class prog01_basics {
	public static void main(String[] args)
	{
		try(Scanner sc= new Scanner(System.in)){
		System.out.println("Enter num1: ");
		int a = sc.nextInt();
		System.out.println("Enter num2: ");
		int b = sc.nextInt();
		System.out.println("Enter num1: ");
		int c = sc.nextInt();
		int sum=a+b+c;
		float result= sum/3.0f;
		System.out.print("Aggregated % in PCM = "+ result);
		}
	}

}
