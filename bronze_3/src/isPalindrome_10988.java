import java.util.Scanner;

public class isPalindrome_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length();
		int check = 1;
		
		for(int i = 0; i < len/2; i++) {
			char front = str.charAt(i);
			char tail = str.charAt(len-1-i);
			if(front != tail) {
				check = 0;
				break;
			}
		}
		System.out.println(check);
	}

}
