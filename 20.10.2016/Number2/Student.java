public class Student {
	private String name; //1
	private String surname; //2
	private int age; // 3
	private String mode_of_study; //4
	private String favorite_color; //5
	private University u1;
	private Faculty f1;

	Student(){
		name = "";
		surname = "";
		age = 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setMode_of_study(String mode_of_study) {
		this.mode_of_study = mode_of_study;
	}

	public String getMode_of_study() {
		return mode_of_study;
	}

	public void setFavorite_color(String favorite_color) {
		this.favorite_color = favorite_color;
	}

	public String getFavorite_color() {
		return favorite_color;
	}

	public void setUniversity(University u1) {
		this.u1 = u1;
	}
	public University getUniversity() {
		return u1;
	}

	public void setFaculty(Faculty f1) {
		this.f1 = f1;
	}

	public Faculty getFaculty() {
		return f1;
	}

	public String sayCitation(){
		return "The only way to get smarter is by playing a smarter opponent. - Fundamentals of chess, 1883";
	}

	public int calculateSumAB(int a, int b) {
		return a + b;
	}

	public int calculateMultiplyAB(int a, int b) {
		return a * b;
	}

	public int calculateDisagreementAB(int a, int b) {
		return a - b;
	}

	public String sayGoodBye() {
		return "Goodbye!";
	}
}