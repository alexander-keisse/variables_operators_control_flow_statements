package be.intecbrussel.demo3;

import java.util.Scanner;

public class MySwitchCase {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        String dayString = "";
        String dayType = "";

        int day;
        boolean casualFriday = false;

        do {

            System.out.println("Please fill in a number corresponding with the day of the week [1-7]");
            day = kbd.nextInt();

            switch (day) {
                case 1:
                    dayString = "Monday";
                    break;
                case 2:
                    dayString = "Tuesday";
                    break;
                case 3:
                    dayString = "Wednesday";
                    break;
                case 4:
                    dayString = "Thursday";
                    break;
                case 5:
                    dayString = "Friday";
                    casualFriday = true;
                    break;
                case 6:
                    dayString = "Saturday";
                    break;
                case 7:
                    dayString = "Sunday";
                    break;
                default:
                    System.out.println("Invalid day!");
            }

            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    if (casualFriday) {
                        System.out.println("Casual clothing allowed");
                    }
                    dayType = "Weekday";
                    break;
                case 6:
                case 7:
                    dayType = "Weekend";
                    break;
                default:
                    System.out.println("Invalid day!");
            }

        } while (day < 1 || day > 7);

        System.out.println(dayString + " is a: " + dayType);
    }
}
