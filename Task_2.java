public class Task_2{
	public static void main(String[] args){
		Integer n = Integer.parseInt(args[0]);
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact = fact * i;
		}
		if(n == 0){
			fact = 1;
		}
		System.out.print(fact);
	}
}