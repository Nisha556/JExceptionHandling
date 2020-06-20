package myfirstproject;
import java.util.Scanner;
public class IfProg {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Numbers:");
	int number = sc.nextInt();
	
	if(number % 5 == 0)
System.out.println("Fizz");
	else if (number % 3 == 0)
		System.out.println("Buzz");
	else
		System.out.println(number);
	

}
}
