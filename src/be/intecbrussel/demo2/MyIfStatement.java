package be.intecbrussel.demo2;

import java.util.Scanner;

public class MyIfStatement {

    public static void main(String[] args) {

        // TODO: Part 1

        boolean flag = true;

        if (flag) {
            System.out.println("It is considered good practice to use brackets " +
                    "with an if statement!!!");
        }

        if (flag) System.out.println("But you can do it this way");  // But only works for 1 statement


        // TODO: Part 2

        Scanner kbd = new Scanner(System.in);

        System.out.println("Please fill in your age: ");
        int age = kbd.nextInt();

        if (age >= 18) {
            System.out.println("You're an adult");
        } else {
            System.out.println("You're a child.");
        }

        // TODO Part 3

        System.out.println("Please fill in your age: ");
        age = kbd.nextInt();

        if (age < 0) {
            System.out.println("Age can not be negative");
        } else if (age < 12) {
            System.out.println("You are a child!");
        } else if (age < 18) {
            System.out.println("You are a teenager!");
        } else {
            if (age > 120) {
                System.out.println("Seems a bit high");
            }
            System.out.println("You are an adult!");
        }

        // TODO Part 4

        int y;
        int x = -22;

        // Either way y will be initialized

        if (x < 0) {
            y = 1;
        } else {
            y = 2;
        }

        System.out.println(y);

        // Java compiler is concerned about initialization [can't guarantee it]

        int z;

        if (x < 0) {
            z = 1;
        }

        if (x >= 0) {
            z = 2;
        }

        // TODO: System.out.println(z);
    }
}
