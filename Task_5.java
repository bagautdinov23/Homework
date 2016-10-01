public class Task_5 { 
	public static void main(String[] args) { 
		int n = Integer.parseInt(args[0]); 
		int sum = 0; 
		int b = n; 
		int i = 0; 
		int[] a = new int[i]; 
		while(n != 0) {
			n = n / 2; 
			i++; 
		} 
		int h = i; 
		int[] arr = new int[h]; 
		i = 0; 
		while(b != 0) {
			arr[i] = b % 2; 
			sum = sum + arr[i]; 
			b = b / 2; 
			i++; 
		} 
		for(int j = i - 1; j >= 0; j--) { 
			System.out.print(arr[j]); 
		} 
		System.out.println(); 
		System.out.println(sum); 
	} 
}