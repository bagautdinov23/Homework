public class Task_12 { 
	public static void main(String[] args) {
	int n = Integer.parseInt(args[0]); 
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	} 
}