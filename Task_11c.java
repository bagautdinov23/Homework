public class Task_11c { 
	public static void main(String[] args) { 
	long st1, en1;
        st1 = System.nanoTime();
		Integer a = Integer.parseInt(args[0]);
		int a1 = a;
		Integer b = Integer.parseInt(args[1]);
		int b1 = b;
		if(a < 0 || b < 0){
			System.out.println("Nelzya! Vvedite chisla > 0");
			return;
		}
		if(a == 0 || b == 0){
			if(a == 0)
			System.out.println(b);
		else
			System.out.println(a);
		}
		//_____________Проверка на адекватность юзера______________________
		while (b != 0){
			int tmp1 = a % b;
			a = b;
			b = tmp1;
		}
		System.out.println(a); // НОД
		en1 = System.nanoTime();
		int time1 = en1 - st1;
		//_______________________________
	}
}