package com.exam;

//class shape // parents class
//field double area // figure area
//method getArea() -> area value and return

abstract class Shape {
	double area;

	abstract double getArea();

}

//class circle : inheritance shape
//field integer radius = 5 // radius 
//method overriding -> calculate circle area and return

class Circle extends Shape {
	int radius = 5;

	double getArea() {
		return area = radius * radius * 3.14;
	}
}
//class rectangle : inheritance shape
//field integer width = 10, height = 10  
//method overriding -> calculate rectangle area and return

class Rectangle extends Shape {
	int width = 10;
	int height = 10;

	double getArea() {
		area = width * height;
		return area;
	}
}
//class triangle : inheritance shape
//field integer width = 10, height = 10  
//method overriding -> calculate triangle area and return

class Triangle extends Shape {
	int width = 10;
	int height = 10;

	// override
	double getArea() {
		return width * height * 0.5;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		System.out.println("circle area: " + c.getArea());

		Rectangle r = new Rectangle();
		System.out.println("Rectangle area: " + r.getArea());

		Triangle t = new Triangle();
		System.out.println("Triangle area: " + t.getArea());

		System.out.println("================");

		Shape s;
		s = new Circle();
		System.out.println("area" + s.getArea());

		s = new Rectangle();
		System.out.println("area:" + s.getArea());

		s = new Triangle();
		System.out.println("area: " + s.getArea());

		System.out.println("================");

		Shape[] shapeArr = new Shape[3];
		shapeArr[0] = new Circle();
		shapeArr[1] = new Rectangle();
		shapeArr[2] = new Triangle();

		for (Shape shape : shapeArr) {
			System.out.println("area: " + shape.getArea());

		}

		System.out.println("================");
		// printShapeArea(new Circle());

		Ex1 ex1 = new Ex1();
		ex1.printShapeArea(new Circle());

	} // main method

	public void printShapeArea(Shape shape) {
		if (shape instanceof Shape) {
			Circle c = (Circle) shape;// down casting
			c.radius = 20;

			System.out.print("Shape area: ");
		} else if (shape instanceof Circle) {
			System.out.print("Circle area: ");
		} else if (shape instanceof Rectangle) {
			System.out.print("Rectangle area: ");
		} else if (shape instanceof Triangle) {
			System.out.print("Triangle area: ");
		}
		System.out.println(shape.getArea());

	}

}
