import java.util.Scanner;

public class findMaxIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [9];

		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int idx = 0;
		
		for(int i = 1; i < 9; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		System.out.println(max);
		System.out.print(idx+1);
		
	}

}
