import java.util.Scanner;

public class MainDop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(proverka(str));

	}

	public static boolean proverka(String str) {
		int check = 0;
		for(int i = 0; i <str.length(); i++) {
			if (check < 0) {
				return false;
			}
			String symbol = str.substring(i, i + 1);
			if (symbol.equals("(")) {
				check++;
				continue;
			}
			if (symbol.equals(")")) {
				check--;
			}
		}
		if (check == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}