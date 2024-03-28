import java.util.Scanner;

public class repeatString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스 개수

		String arr[] = new String[T];
		
		for(int i = 0; i < T; i++) { //배열에 추가해서 한 번에 출력하기
			int R = sc.nextInt();
			String str = sc.next();
			
			StringBuilder sb = new StringBuilder();
			for(int k = 0; k < str.length(); k++) {
				for(int j = 0; j < R; j++) {
					sb.append(str.charAt(k));
				}
			}
			arr[i] = sb.toString();
		}
		/*for(int i = 0; i < T; i++) { //입력받자마자 출력하기
			int R = sc.nextInt();
			String str = sc.next();
			
			for(int k =0; k < str.length(); k++) {
				for(int j = 0; j < R; j++) {
					System.out.print(str.charAt(k));
				}
			}
			System.out.println();
		}
		*/
		for(int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
	}

}
