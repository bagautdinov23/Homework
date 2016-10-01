import java.util.Scanner;
public class Task_13 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Double rad = sc.nextDouble();
	Double xk , jy , jx;
	for(jy = -rad; jy <= rad; jy++){
		xk = Math.sqrt(rad * rad - jy * jy);
		for(jx = -rad; jx <= -xk; jx++){
			System.out.print(" ");
		}
		for(jx = -xk; jx <= xk; jx++){
			System.out.print("*");
		}
		System.out.println();
	}
	}
}