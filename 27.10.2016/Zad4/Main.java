import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int bracket1 = 0;
		int bracket2 = 0;

		//proverka
		for(int i = 0; i < n.length(); i++ ) {
			if(n.charAt(0) == ')') {
				System.err.println("ERROR");
				return;
			}

			if(n.charAt(i) == '(' ) {
				bracket1++;
			}

			if(n.charAt(i) == ')' ) {
				bracket2++;
			}
		}

		if(bracket1 != bracket2) {
			System.err.println("NO");
			return;
		}
		//end proverka

		bracket1 = 0;
		bracket2 = 0;
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '(' ) {
				bracket1++;
			}
			else if(n.charAt(i) == ')') {
				bracket2++;
				if(bracket1 < bracket2) {
					System.err.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}

}