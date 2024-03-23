import java.util.Scanner;

public class calculateAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int arr[] = new int [N];
		
		for(int i = 0; i< N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i = 1; i < N; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		
		double new_arr[]= new double [N]; //double형으로 만들어야 함
		for(int i = 0; i< N; i++) {
			new_arr[i] = (double) arr[i]/max * 100; //강제 형변환
		}
		
		double average = 0;
		for(int i = 0; i < N; i++) {
			average += new_arr[i];
		}
		average = average/new_arr.length;
		
		System.out.print(average);
	}

}
