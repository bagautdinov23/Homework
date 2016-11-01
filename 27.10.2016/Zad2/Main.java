import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] a = new int[5];
		int range = 5;
		
		for(int i = 0; i < 5; i++) {
			a[i] = (int)(Math.random()*range);
		}

		System.out.println(Arrays.toString(a));

		for(int i = 0; i < 3; i++) {
			a[i + 2] = a[i] * a[i+1];
		}

		System.out.println(Arrays.toString(a));

	}
}