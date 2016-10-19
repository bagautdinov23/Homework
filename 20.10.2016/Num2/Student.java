public class Student {
	int age;
	int course;
	String name;
	University kpfu;
	Cry hungry;
	Hostel du;

	Student() {
		String name = " ";
		int course = 0;
		int age = 18;
	}

	String sayHungry(){
		return "I'm Hungry Student \n ";
	}

	String sayGood(){
		return "I'm a good Student \n";
	}

	String sayBad() {
		return "I'm a bad Student \n";
	}
	int newCourse(int course) {
		this.course = course++;
	}
	int growUp(int age) {
		this.age = age++;
	}

}