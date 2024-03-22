import java.util.Scanner;

public class putBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();//바구니 갯수
		int M = sc.nextInt(); //넣을 횟수
		
		int[] basket = new int[N];
		
		for(int i = 0; i < N; i++) {
			basket[i] = 0;
		}
		
		for(int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int ball = sc.nextInt();
			
			for(int j = start-1; j < end; j++) {
				basket[j] = ball;
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(basket[i]+" ");
		}
	}
}
