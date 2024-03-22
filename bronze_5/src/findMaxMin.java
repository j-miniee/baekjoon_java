import java.util.Scanner;

public class findMaxMin {

	public static void main(String[] args) {
		int n, i, min, max;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[] arr = new int[n];
		
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		min = arr[0];
		max = arr[0];
		for(i = 1; i < n; i++) {
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.print(min + " " + max);
		
	}

}
