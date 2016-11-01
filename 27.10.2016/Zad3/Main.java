import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] a = new int[5];
		int range = 5;

		a[0] = (int)(Math.random() * range);
		for(int i = 1; i < 5; i++) {
			a[i] = a[i - 1] * a[i-1];
		}

		System.out.println(Arrays.toString(a));

	}
}