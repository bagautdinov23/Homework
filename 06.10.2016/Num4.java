import java.util.Scanner;
public class Num4 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	String str1 = sc.next();
    	String str2 = sc.next();
    	int length1 = str1.length();
    	int length2 = str2.length();
  	  	if(length1 == length2){
    		 for(int i = 0; i < length1; i++){
    		 	if(str1.charAt(i) == str2.charAt(i)){
    		 		System.out.println(i + " symbol sovpadaet");
    		 	}
    		 	else {
    		 		System.out.println(i + " symbol ne sovpadaet");
    		 	}
    	 	}
		}
		else{
			System.out.println("vvedite rabniye stroki");
		}
  	}
}