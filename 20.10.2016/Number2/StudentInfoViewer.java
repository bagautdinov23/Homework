import java.util.Scanner;
public class StudentInfoViewer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		University u1 = new University();
		Faculty f1 = new Faculty();
		s1.setName("Amir");
		s1.setSurname("Bagautdinov");
		u1.setName("KFU");
		f1.setName("HS ITIS");
		s1.setFaculty(f1);
		s1.setUniversity(u1);
		s1.setAge(18);
		s1.setFavorite_color("White");
		s1.setMode_of_study("Full-time");
		System.out.println("Student's name: " + s1.getName());
		System.out.println("Student's surname: " + s1.getSurname());
		System.out.println("Age: " +s1.getAge());
		System.out.println("Favorite color: " + s1.getFavorite_color());
		System.out.println("Mode of study: " + s1.getMode_of_study());
		System.out.println("University: " + s1.getUniversity().getName());
		System.out.println("Faculty: " + s1.getFaculty().getName());
		System.out.println("Favorite citation: " + s1.sayCitation());
		System.out.println();
		System.out.println("Enter two integer numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Sum = ");
		System.out.println(s1.calculateSumAB(a, b));
		System.out.print("Factum = ");
		System.out.println(s1.calculateMultiplyAB(a, b));
		System.out.print("Disagreement = " );
		System.out.println(s1.calculateDisagreementAB(a, b));
		System.out.println(s1.sayGoodBye());
	}
}