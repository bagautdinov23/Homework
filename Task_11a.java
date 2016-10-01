public class Task_11a {
public static void main(String[] args){
		long st1, en1;
        st1 = System.nanoTime();
		Integer n = Integer.parseInt(args[0]);
		int n1 = n;
		Integer k = Integer.parseInt(args[1]);
		int k1 = k;
		if(n < 0 || k < 0){
			System.out.println("Nelzya! Vvedite chisla > 0");
			return;
		}
		if(n == 0 || k == 0){
			if(n == 0)
			System.out.println(k);
		else
			System.out.println(n);
		}
		//_____________Проверка на адекватность юзера______________________
		while (k != 0){
			int tmp = n % k;
			n = k;
			k = tmp;
		}
		System.out.println(n); // НОД
		en1 = System.nanoTime();
		int time1 = en1 - st1;
    System.out.println( "Time = " time1);
	}
}