package entity;

public class Cricle {
	private double radius;
	private String color;
	public static final Double PI = 3.14;
	
	public Cricle() {
		
	}
	public Cricle(double radius) {
		this.radius=radius;
		
	}
	public Cricle(double radius,String color) {
		this.radius=radius;
		this.color=color;
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		
	}
	public Double getArea() {
		return PI * Math.pow(this.radius, 2.0);
	}
	@Override
	public String toString() {
		return "Cricle [radius=" + radius + ", color=" + color + "]";
	}
	
}
