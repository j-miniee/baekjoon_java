import java.util.Scanner;

public class countValues {

	public static void main(String[] args) {
		int n, cnt = 0, size ;
		
		Scanner sc = new Scanner(System.in);
		
		size = sc.nextInt();
		int[] num = new int[size];
		
		for(int i =0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		n = sc.nextInt();
		
		for(int i = 0; i < size;i++) {
			if(num[i] == n)
				cnt++;
		}
		System.out.print(cnt);
		
		sc.close();
	}

}