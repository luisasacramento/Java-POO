package application;

import java.util.Scanner;

import entities.Rectangle;


public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter the measures of Width and Height: ");

        rect.height = sc.nextDouble();
        rect.width = sc.nextDouble();

        System.out.println("area:" + rect.area());
        System.out.println("perimeter:" + rect.perimeter());
        System.out.println("diagonal:" +rect.diagonal());

        sc.close();

    }

}
