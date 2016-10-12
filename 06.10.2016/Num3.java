import java.util.Scanner;
import java.util.Arrays;
public class Num3 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		System.out.print("fill in arr1 with 5 numers ");
		for(int i = 0; i < 5; i++){
			arr1[i] = sc.nextInt();
		}
	System.out.print("fill in arr2 with 5 numers ");
		for(int i = 0; i < 5; i++){
			arr2[i] = sc.nextInt();
		}
		if(arr1.length < arr2.length){
			System.out.print("Vvedite razmer pervogo massiva takoy, ");
			System.out.println("4to on budet bol`we razmera vtorogo massiva ili raven emu");
			return;
		}
		else {
			for(int i = 0; i < arr2.length; i++){
				for(int j = 0; j < arr1.length; j++){
					if( arr1[j] == arr2[i]){
						System.out.println( "arr2[" + i + "] " + " coincides with " + " arr1["+ j + "]");
					}
				}
			}
		}
	}
}
