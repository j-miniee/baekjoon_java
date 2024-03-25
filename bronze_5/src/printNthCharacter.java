import java.util.Scanner;

public class printNthCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int i = sc.nextInt()-1;
		
		char N = S.charAt(i);
		
		System.out.print(N);
		
	}

}
