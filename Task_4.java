public class Task_4 {
	public static void main(String[] args){
		Integer a = Integer.parseInt(args[0]);
		Integer b = Integer.parseInt(args[1]);
		Integer k = Integer.parseInt(args[2]);
		if( k <= 0 ){
			System.out.print("Vvedite chislo bol`we 0");
		}
		int d = b - a;
		k = a + ( k - 1) * d;
		System.out.print(k);
	}
}