import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int openBrackets = 0;
		int closeBrackets = 0;
		String n = sc.nextLine();
		System.out.println(proverka(n));
		}

	public static String proverka(String n) {
		int i = 0;
		String flag = "NO";
		if(n.charAt(0) == ')')  {
			flag = "NO";
			return flag;
		}
		
		return flag;
	}
}