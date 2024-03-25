import java.util.Scanner;

public class getFirstAndLastCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String arr[] = new String[T];
		
		for(int i = 0; i < T; i++) {
			String str = sc.next(); //sc.nextLine()하면 개행문자 받게 된다.
			int len = str.length();
			arr[i] = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(len-1));
		}
		
		/*
		 for(int i = 0; i < T; i++){
		 	String str = sc.nextLine();
		 	arr[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
		 */
		
		for(int i =0; i< T; i++) {
			System.out.println(arr[i]);
		}
	}
}
