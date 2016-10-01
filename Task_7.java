public class Task_7 { 
	public static void main(String[] args) { 
		int n = Integer.parseInt(args[0]); 
		int c = 0; 
		int maxc = 0; 
		while (n != 0) { 
		int b = n % 2; 
		if (b == 0) { 
			c++; 
		} 
		else { 
			c = 0; 
		} 
		if (c > maxc) { 
			maxc = c; 
		} 
		n = n / 2; 
		
		} 
		
		System.out.println(maxc);
	}
}