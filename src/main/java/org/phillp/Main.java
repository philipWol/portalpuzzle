package org.phillp;

import org.phillp.quantum.Point;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates for Point A: ");
        Point pointA = createPoint(scanner);
        System.out.println("Enter coordinates for Point B: ");
        Point pointB = createPoint(scanner);
        if (pointA.calculateEnergy() == pointB.calculateEnergy()) {
            System.out.println("A stable portal can be opened.");
        } else {
            System.out.println("A stable portal cannot be opened.");
        }

    }

    public static Point createPoint(Scanner scanner) {

        System.out.println("Enter x coordinate ");
        int x = scanner.nextInt();
        System.out.println("Enter y coordinate ");
        int y = scanner.nextInt();
        System.out.println("Enter z coordinate ");
        int z = scanner.nextInt();
        return new Point(x, y, z);
    }
}
