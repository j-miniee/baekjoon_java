import java.util.Scanner;

public class getMinimumDialingTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String num = sc.next();
		
		int total = 0;
		
		for (int i = 0; i < num.length(); i++) {
			//문자열의 끝을 나타내는 '\0'은 자바에서 사용하지 않음.
			char n = num.charAt(i);
			switch(n) {
				case 'A', 'B', 'C':
					total += 3;
					break;
				case 'D', 'E', 'F':
					total += 4;
					break;
				case 'G', 'H', 'I':
					total += 5;
					break;
				case 'J', 'K', 'L':
					total += 6;
					break;
				case 'M', 'N', 'O':
					total += 7;
					break;
				case 'P', 'Q', 'R', 'S':
					total += 8;
					break;
				case 'T', 'U', 'V':
					total += 9;
					break;
				case 'W', 'X', 'Y', 'Z':
					total += 10;
					break;
			}
		}
		
		System.out.println(total);
		
	}

}
