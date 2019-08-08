package com.j87;

public class Point {
	int x;
	int y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double distance() {
		return Math.sqrt((this.x)*(this.x)+
				(this.y)*(this.y));
	}
	public double distance(Point a) {
		return Math.sqrt((this.x-a.x)*(this.x-a.x)+
				(this.y-a.y)*(this.y-a.y));
	}
	public static void main(String[] args) {
		Point p = new Point(3,4);
		Point o = new Point(0,0);
		System.out.print(p.distance());
	}
}
