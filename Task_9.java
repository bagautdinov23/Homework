import java.util.Scanner;
public class Task_9 {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		for(int i = 1; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				if( i == Math.sqrt(n)){
					System.out.print(i + " ");
					continue;
				}
				System.out.print(i + " " + n / i + " ");
			}
		}
	}
}