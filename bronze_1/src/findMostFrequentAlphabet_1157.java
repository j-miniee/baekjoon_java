import java.util.Scanner;

public class findMostFrequentAlphabet_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int alph[] = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); //M
			//'A' = 65, 'a' = 97
			if(ch >= 'A' && ch <= 'Z') {
				int idx = ch - 65;
				alph[idx]++;
			}
			else {
				int idx = ch - 97;
				alph[idx]++;
			}
			
		}
		int max = 0;
		int max_idx = 0;
		int cnt = 0;
		for(int i = 0; i < alph.length; i++) {
			if(max < alph[i]) {
				max = alph[i];
				max_idx = i;
			}
		}
		for(int i = 0; i < alph.length; i++) {
			if(max == alph[i]) {
				cnt++;
			}
		}
		if(cnt == 1) {
			char p =(char)(65 + max_idx);
			System.out.print(p);
		}
		else {
			System.out.print("?");
		}
		
	}

}
