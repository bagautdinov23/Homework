package bagautdinov_amir.homework.task_62;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Table table1 = new Table("121A");
        System.out.println(table1.getNameModel());
        table1.create();

        Ball_1 basket = new Ball_1();
        basket.throwBall();
    }
}
