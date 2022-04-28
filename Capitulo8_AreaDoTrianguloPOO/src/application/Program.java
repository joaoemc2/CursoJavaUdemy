package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the meassures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the meassures of triangle Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();


		double xArea = x.area();
		double yArea = y.area();

		System.out.printf("Triangle X area: %.2f\nTriangle Y area: %.2f\n", xArea, yArea);

		if (xArea > yArea) {
			System.out.println("\nLager area is X");
		} else if(xArea < yArea){
			System.out.println("\nLarger area is Y");
		}
		else {
			System.out.println("\nX = Y");
		}

		sc.close();
	}

}
