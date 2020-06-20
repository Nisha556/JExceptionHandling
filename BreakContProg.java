package myfirstproject;
import java.util.Scanner;
public class BreakContProg {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
			

String input = "";
while(!input.equals("quit"))
{
	System.out.println("Input: ");
	input = sc.nextLine();
	if(input.equals("pass"))
		continue;
	if(input.equals("quit"))
		break;
	System.out.println(input);
	
}
}
}