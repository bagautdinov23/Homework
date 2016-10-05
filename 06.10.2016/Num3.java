import java.util.Random;
import java.util.Arrays;
public class Num3 { 
	public static void main(String[] args) {
		int index;
		index = -1;
	int size1 = Integer.parseInt(args[0]); // размер 1 массива
	int size2 = Integer.parseInt(args[1]); // размер 2 массива
	int[] arr1 = new int[size1];
	// заполняем 1 массив
	for(int i = 0; i < arr1.length; i++){
		arr1[i] = Integer.parseInt(args[i + 2]);
	}
	// заполняем 2 массив
	int[] arr2 = new int[size2];
	for(int i = 0; i < arr2.length; i++){
		arr2[i] = Integer.parseInt(args[arr1.length + 3]);
	}
	if(arr1.length < arr2.length){
		System.out.print("Vvedite razmer pervogo massiva takoy, ");
		System.out.println("4to on budet bol`we razmera vtorogo massiva ili raven emu");
		return;
	}
	else {
		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr1.length; j++){
				if(arr2[i] == arr1[j]){
					index = j - 1;
					break;
				}
				else {
					index = -1;
				}
			}
			break;
		}
		if(index == -1){
			System.out.println("Net sovpadeniy");
		}
		else {
			System.out.println(index);
		}
		}
	}

		/*
	//заполним массивы рандомными числами
	for(int i = 0; i < arr1.length; i++){
		arr1[i] = (int) ( Math.random() * 11);
		System.out.print(arr1[i] + " ");
	}
	for(int i = 0; i < arr2.length; i++){
		arr2[i] = (int) ( Math.random() * 11);
		System.out.print(arr2[i] + " ");
	}
		*/
}
