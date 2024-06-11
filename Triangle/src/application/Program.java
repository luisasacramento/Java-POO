package application;

import entities.Triangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextInt();
        y.b = sc.nextInt();
        y.c = sc.nextInt();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("triangle x: ", areaX);
        System.out.printf("triangle Y: ", areaY);

        sc.close();




    }
}
