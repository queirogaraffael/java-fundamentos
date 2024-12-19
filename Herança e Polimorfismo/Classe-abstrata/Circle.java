public class Circle extends Shape {
	private Double radius;

	private static final Double PI = 3.0;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double Area() {
		return PI * radius * radius;
	}

}