import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int br1 = 0;
		int br2 = 0; 
		//proverka

		for(int i = 0; i < n.length(); i++ ) {
			if(n.charAt(0) == ')' || n.charAt(0) == ']' || n.charAt(0) == '}') {
				System.err.println("ERROR");
				return;
			}

			if(n.charAt(i) == '(' ) {
				br1++;
			}

			if(n.charAt(i) == ')' ) {
				br2++;
			}
		}

		if(br1 != br2) {
			System.err.println("ERROR");
			return;
		}
		//end proverka
		br1 = 0;
		br2 = 0;
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '(' ) {
				br1++;
			}
			else if(n.charAt(i) == ')') {
				br2++;
				if(br1 < br2) {
					System.err.println("ERROR");
					return;
				}
			}
		}
		System.out.println("YES");

	}

}
