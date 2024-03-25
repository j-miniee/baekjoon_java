import java.util.Scanner;

public class PrintAsciiCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int ch = str.charAt(0); //여기서 char형이 아닌 int형으로 받기.
		
		System.out.print(ch);
		
 	}

}
