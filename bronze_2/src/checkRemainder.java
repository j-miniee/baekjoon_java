import java.util.Scanner;

public class checkRemainder {

	public static void main(String[] args) {
		//나머지 넣는 배열 생성 -> 앞의 값과 비교
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt()% 42;
		}
		
		int cnt = 0;
		
		for(int i = 0; i <arr.length; i++) {
			boolean same = false; 
			//같은지 다른지 확인 후 그에 따른 count 해줘야 함.
			for(int k = i+1; k < arr.length; k++) {
				if(arr[i]== arr[k]) {
					same = true;
					break; //끝까지 진행할 필요 없이 바로 빠져 나올 수 있음
				}
			}
			if(same == false)
				cnt++;
		}
		
		System.out.print(cnt);
	}

}
