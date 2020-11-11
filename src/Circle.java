
public class Circle {

	private int x;
	private int y;
	private double radius;
	private String name;
	boolean bool;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public String getName() {
		return name;
	}
	public boolean isBool() {
		return bool;
	}

	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBool(boolean bool) {
		this.bool=bool;
	}
	
	
	
	
	public Circle() {
	}

	// return value가 없습니다.
	// return 메서드 종료
	public void display() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("radius : " + radius);
		// return;
	}

	public double calcRound(double radius) {
		this.radius = radius;

		double result = 2 * Math.PI * radius;
		return result;

	}
}
