import java.util.Scanner;
public class reverseBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i< M; i++) {
			int start = sc.nextInt() -1; //인덱스 맞춰주기
			int end = sc.nextInt() -1;
			while(start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			/*
			 for(int k = 0; k <= (end - start)/2; k++){
			 	int temp = arr[start+k];
			 	arr[start+k] = arr[end - k];
			 	arr[end -k] = temp;
			 }
			 */
		}
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
