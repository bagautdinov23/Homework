import java.util.Random;
import java.util.Arrays;

public class MainDop {
    public static void main(String[] args) {

		Random random = new Random();
		int[] a = new int[10];
		int range = 10;
		for(int i = 0; i < 10; i++) {
			a[i] = (int)(Math.random()*range);
		}		

 		System.out.println(Arrays.toString(a));

        String str = Arrays.toString(a);
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());
    }
}
