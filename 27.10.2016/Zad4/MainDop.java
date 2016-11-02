import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int br11 = 0;
		int br12 = 0;
		int br21 = 0;
		int br22 = 0;
		int br31 = 0;
		int br32 = 0;

		for(int i = 0; i < n.length(); i++ ) {
			if(n.charAt(0) == ')' || n.charAt(0) == ']' || n.charAt(0) == '}') {
				System.err.println("ERROR");
				return;
			}		
		}
		}

}