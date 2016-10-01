public class Task_11b {
public static void main(String[] args){
		 long st, en;
        st = System.nanoTime();
		Integer n = Integer.parseInt(args[0]);
		Integer k = Integer.parseInt(args[1]);
		int max = 1;
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
		//________________Проверка___на адекватность______
		if (n >= k){
			for(int i = 1; i <= k; i++){
				if(n % i == 0 && k % i == 0 && max <= i){
					max = i;
				}
			}
		}
			else{
				for(int i = 1; i <= n; i++){
					if(n % i == 0 && k % i == 0 && max <= i ){
						max = i;
					}
				}
			}
			System.out.println(max);
	en = System.nanoTime();
	int time = en - st;
    System.out.println( "Time = " + time);
		
	}
}