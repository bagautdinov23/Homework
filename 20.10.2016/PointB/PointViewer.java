import java.io.*;
public class PointViewer {
	public static void main(String[] args) throws FileNotFoundException {
		Point p1 = new Point();
		p1.scan();
		DistanceCalculator dc = new DistanceCalculator();
		System.out.println( dc.dCalc(p1) );
	}
}