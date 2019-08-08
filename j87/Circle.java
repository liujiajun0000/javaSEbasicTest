package com.j87;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class Circle {
	double r ;
	int x;
	int y;
	Point a;	

	public Circle(Point a,int r) {
		this.a=a;
		this.r=r;
	}
	public Circle(int x,int y) {
		this.x =x;
		this.y =y;
	}
	public Circle(double r) {
		this.r=r;
	}
	public double Area() {
		return Math.PI*r*r;
	}
	
	public boolean contains(Point a){
		Point p = new Point(2,3);
		double in = p.distance(a);
		if(in<=r) {
			return true;
		}
		return false;
	}
	public double contains(int x1,int y1){
		return Math.sqrt((this.x-x1)*(this.x-x1)+
				(this.y-y1)*(this.y-y1));
	}
	public static void main(String[] args) {
		Circle c = new Circle(2);
		System.out.println(c.Area());
		
		Circle b = new Circle(3,4);
		Point a = new Point(2,1);
		System.out.println(b.contains(a));
		
		Point z = new Point(3,1);
		Circle d = new Circle(z,2);
		Point x = new Point(2,2);
		boolean f = d.contains(x);
		System.out.print(f);
	}
	
	
}
