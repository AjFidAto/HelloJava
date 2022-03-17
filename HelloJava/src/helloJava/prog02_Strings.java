package helloJava;
import java.util.Scanner;

public class prog02_Strings {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = "AjFidato";
		String str2 = new String("Aj");
		System.out.print("Enter the string: ");
		String str3 = sc.next(); 
		System.out.println(str1 + "\n" + str2 + "\n" + str3);
		int value = str1.length();
		System.out.println("Length of "+ str1 + " is " + value);
		String lcase = str3.toLowerCase();
		System.out.println("Inputted String in LowerCase is : "+ lcase);
		String ucase = str3.toUpperCase();
		System.out.println("Inputted String in UpperCase is : "+ ucase);
	}
}
