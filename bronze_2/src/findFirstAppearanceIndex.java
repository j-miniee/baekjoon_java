import java.util.Scanner;

public class findFirstAppearanceIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int len = str.length();
		
		int arr[] = new int[26]; //배열 선언 & 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1; //배열 초기화
		}
		
		for(int i = 0; i < len; i++) {
			int Idx = str.charAt(i) -'a';
			if(arr[Idx] == -1) {
				arr[Idx] = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
