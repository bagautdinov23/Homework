import java.util.Scanner;
public class Num5 { 
	public static void main(String[] args) {
		int k = -1;
		int a = 0;
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
    	String str2 = sc.nextLine();
		int length1 = str1.length();
    	int length2 = str2.length();
	    	if(length1 < length2) {
				System.out.print("Vvedite odinakoviiye stroki po razmery ");
				System.out.println("ili 4tobi vtoraya stroka bila < pervoy");
				return;
			}
			// programms works only if str1 belong str2;
			//  else answer is wrong  
			for(int i = 0; i < length2; i++){
				for(int j = 0; j < length1; j++){
					if(str2.charAt(i) == str1.charAt(j)){
						// I want to save number, that begins belong
						if( a == 0){
							k = j;
							a++;
						}
						continue;
					}
				}
			}
			if( k == -1){
				System.out.println(" Second line don't belong to first line");
						return;
			}
			else {
				System.out.println( "Second line start belong since " + k + " number of array");
			}

	}
}
