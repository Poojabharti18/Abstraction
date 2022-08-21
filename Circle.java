package abstraction;

public class Circle extends Shape{
	private int radius;
	public Circle()
	{
		
	}
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public int getRadius()
	{
		return radius;
	}
	public void set(int radius)
	{
		this.radius=radius;
	}
	public double CalculateArea()
	{
		return 3.14*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", CalculateArea()=" + CalculateArea() + "]";
	}


}
