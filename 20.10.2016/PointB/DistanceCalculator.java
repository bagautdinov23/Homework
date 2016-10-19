public class DistanceCalculator {
	public double dCalc (Point p1) {
		double x = p1.getX();
		double y = p1.getY();
		double x1 = p1.getX1();
		double y1 = p1.getY1();
		return Math.sqrt( (x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) );
	}
}