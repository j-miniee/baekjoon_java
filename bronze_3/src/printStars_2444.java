import java.util.Scanner;

public class printStars_2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(j = 0; j < N; j++) {//N=5
			for(k = 0; k < N-j-1; k++) {
				System.out.print(" ");
			}
			for(i = 0 ; i < 2*j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//7-5-3-1(N=5) / 9-7-5-3-1(N=6)
		for(j = N-1; j > 0; j--) { //j = 4
			for(k = N-1; k >= j; k--) {//(N-1)=4, 4~4,4<=3
				System.out.print(" "); // 4 <= 2
			}
			for(i = 2*j -1; i > 0 ; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
