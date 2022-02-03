package be.intecbrussel.demo4;

import javax.sound.midi.MidiFileFormat;
import java.util.Random;
import java.util.Scanner;

public class MyWhileLoop {

    public static void main(String[] args) {

        // TODO: Part 1
        int x = 1;

        while (x <= 100) {

            // TODO: To find all even numbers between 1 and 100
            if(x % 2 == 0) {
                System.out.println("Value of x: " + x);
            }

            x++;
        }

        System.out.println("This will be printed after the while");

        Scanner kbd = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100);

        boolean isGuessing = true;

        while (isGuessing) {

            System.out.println("Enter a number: ");
            int guess = kbd.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else {
                if (guess > numberToGuess) {
                    System.out.println("Lower!");
                } else {
                    System.out.println("Guessed!");
                    isGuessing = false;
                }
            }
        }

        System.out.println("You have won the game :)");

    }
}
