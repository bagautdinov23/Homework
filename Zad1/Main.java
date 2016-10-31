import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] a = new int[10];
		int range = 10;
		for(int i = 0; i < 10; i++) {
			a[i] = (int)(Math.random()*range);
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for(int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[9-i];
			a[9-i] = temp;
		}

		for(int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");		}
	}
}