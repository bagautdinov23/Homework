import java.util.Scanner;
public class Num5 { 
	public static void main(String[] args) {
		int k = -1;
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
    	String str2 = sc.next();
		int length1 = str1.length();
    	int length2 = str2.length();
    	if(length1 < length2){
		System.out.print("Vvedite odinakoviiye stroki po razmery ");
		System.out.println("ili 4tobi vtoraya stroka bila < pervoy");
		return;
	}
	for(int i = 0; i < length2; i++){
			if(str2.charAt(0) == str1.charAt(i)){
				k = i;
				System.out.println(k);
				return;
			}
	}
	System.out.println("Net sovpadeniy");
	}
}