package task;
import java.util.Scanner;

public class LengthofaGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter the string: ");
		String msg =sc.nextLine();
		System.out.println("Length of the String:" +msg.length());
	}
}		