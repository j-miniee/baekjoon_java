import java.util.Scanner;

public class reverseCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int r1 = 0, r2 = 0;
		
		while( n1 != 0) {
			r1 = r1*10 + n1%10;
			n1 = n1 /10;
		}
		while(n2 != 0) {
			r2 = r2 *10 + n2%10;
			n2 = n2/10;
		}
		
		System.out.print(r1> r2 ? r1 : r2);
		
		
		 /*
		 n1 = Integer.parseInt(new StringBuilder().append(n1).reverse().toString());
		 n2 = Integer.parseInt(new StringBuilder().append(n2).reverse().toString());
		  //각 숫자에 대해 새로운 StringBuilder 인스턴스 생성해야 함. 
		 System.out.print(n1 > n2 ? n1: n2);
		*/
	}

}
