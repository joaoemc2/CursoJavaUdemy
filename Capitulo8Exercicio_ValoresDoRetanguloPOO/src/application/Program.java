package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangleA,rectangleB;
		rectangleA = new Rectangle();
		rectangleB = new Rectangle();
		
		System.out.println("Enter rectangle A width and height:");
		rectangleA.height = sc.nextDouble();
		rectangleA.width = sc.nextDouble();
			
		System.out.println("Area = " + rectangleA.area());
		System.out.println("Perimeter = " + rectangleA.perimeter());
		System.out.println("Diagonal = " + rectangleA.diagonal());
		
		System.out.println("Enter rectangle B width and height:");
		rectangleB.height = sc.nextDouble();
		rectangleB.width = sc.nextDouble();
		
		System.out.println("Area = " + rectangleB.area());
		System.out.println("Perimeter = " + rectangleB.perimeter());
		System.out.println("Diagonal = " + rectangleB.diagonal());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
