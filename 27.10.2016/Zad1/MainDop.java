// import java.util.Scanner;
// import java.util.Random;
// import java.util.Arrays;
import java.util.*;

public class MainDop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] a = new int[10];
		int range = 10;
		ArrayList arrlist = new ArrayList();


		for(int i = 0; i < 10; i++) {
			a[i] = (int)(Math.random()*range);
			arrlist.add(a[i]);
		}

		System.out.println("First mas: " + arrlist);
		Collections.reverse(arrlist);
		System.out.println("Second max: " + arrlist);
	
	}
}


