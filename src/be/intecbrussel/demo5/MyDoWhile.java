package be.intecbrussel.demo5;

import java.util.Scanner;

public class MyDoWhile {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        String password;

        do {
            System.out.println("Please fill in a password that is at least 4 characters long");
            password = kbd.nextLine();
        } while (password.length() < 4);

        kbd.close();

        boolean flag = true;
        int counter = 0;

        do {

            counter++;

            if (counter == 5) {
                flag = false;
            }

            System.out.println("Loop condition is: " + flag);

        } while (flag);

    }

}
