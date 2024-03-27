import java.util.Scanner;

public class repeatString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스 개수

		String arr[] = new String[T];
		
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			arr[i] = sc.next();
			
			StringBuilder sb = new StringBuilder();
			int cnt = 0;
			for(int k = 0; k < arr.length; k++) {
				do {
					sb.append(arr.charAt(k));
					cnt++;
				}while(cnt %R != 0);
			}
			arr[i] = sb.toString();
		}
		
		
		for(int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
	}

}
