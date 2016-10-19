import java.util.Scanner;
import java.io.*;
public class Point {
	double x, y, x1, y1;

	Point() { //make the constructor
	x = 0;
	y = 0;
	x1 = 0;
	y1 = 0;
	}

	void scan()  {
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
	}

	void setX(double newX) {
		x = newX;
	}

	void setY(double newY) {
		y = newY;
	}

	void setX1(double newX1) {
		x1 = newX1;
	}	

	void setY1(double newY1) {
		y1 = newY1;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	double getX1() {
		return x1;
	}

	double getY1() {
		return y1;
	}

}