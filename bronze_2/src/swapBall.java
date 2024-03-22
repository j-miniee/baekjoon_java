import java.util.Scanner;

public class swapBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 갯수
		int M = sc.nextInt(); // 바꿀 횟수
	
		int [] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < M; i++) {
			int first = sc.nextInt()-1;
			int second = sc.nextInt()-1;
			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
