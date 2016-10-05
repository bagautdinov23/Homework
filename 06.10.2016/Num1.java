import java.util.Scanner;
public class Num1{
	public static void main(String[] args){
		int size = Integer.parseInt(args[0]); // размер массива		
		int[] a = new int[size];//сам массив, который нужно отсортировать
		//считаем массив
		for(int i = 0; i < size; i++){
			a[i] = Integer.parseInt(args[i+1]);
		}
		for(int i = 0; i < size; i++){
			for(int j = size - 1; j > i; j--){
				// меняем, если элемента стоят неправильно
				if(a[j] < a[j - 1]){
				int tmp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = tmp;
				}
			}
		}
		//выводим отсортированный массив
		for(int i = 0; i < size; i++){
			System.out.print(a[i] + " ");
		}
	}
}