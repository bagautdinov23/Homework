public class Task_6 { 
	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in ); 
		int n = Integer.parseInt(args[0]); 
		int k = Integer.parseInt(args[1]); 
		int sum = 0; 
		int b = n; 
		int i = 0; 
		int[] a = new int[i]; 
		while(n != 0) {
			n = n / k; 
			i++; 
		} 
		int h = i; 
		int[] arr = new int[h]; 
		i = 0; 
		while(b != 0) {
			arr[i] = b % k; 
			sum = sum + arr[i]; 
			b = b / k; 
			i++; 
		} 
		for(int j = i - 1; j != 0; j--) { 
			System.out.print(arr[j]); 
		} 
		System.out.println(); 
		System.out.println(sum); 
	} 
}