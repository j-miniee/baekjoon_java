import java.util.Scanner;

public class sumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i<N; i++) {
			sum += str.charAt(i) - '0';
		}
		
		/*
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
		}*/
		System.out.print(sum);

	}

}
