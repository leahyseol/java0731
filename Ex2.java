package com.exam2;

public class Ex2 {

	abstract class shape2D extends Object {
		abstract void draw();
	}
		class Cir extends shape2D {
			void draw() {
				System.out.println("draw circle: ");
			}
		}

		class Rec extends shape2D {
			void draw() {
				System.out.println("draw rectangle: ");
			}
		}

		class Tri extends shape2D {
			void draw() {
				System.out.println("draw triangle: ");
			}
		}
	

	public static void main(String[] args) {

		shape2D s;
		
		s=new Cir();
		s.draw();
	
		s=new Rec();
		s.draw();
		
		s=new Tri();
		s.draw();
	}// main

}
