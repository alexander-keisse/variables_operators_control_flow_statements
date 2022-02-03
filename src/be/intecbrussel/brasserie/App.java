package be.intecbrussel.brasserie;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int startHour;
        int startMin;
        int stopHour;
        int stopMin;
        int startDay;

        int totalWorkedHours;
        int totalWorkedMinutes;
        int allWorkTimeConvertedToMinutes;
        int minutesAfterMidnight;

        double wage;

        final int HOURS_IN_DAY = 24;
        final int MIN_IN_HOUR = 60;
        final double SALARY_PM = 11.5 / 60;
        final double BONUS_PERCENTAGE_25 = .25;
        final double BONUS_PERCENTAGE_50 = .50;


        // Asking for user input, while checking for bad values
        do {
            System.out.println("Fill in the hour you started working. [0-23]");
            startHour = kbd.nextInt();
        } while (startHour < 0 || startHour > 23);

        do {
            System.out.println("Fill in the minutes you started working. [0-59]");
            startMin = kbd.nextInt();
        } while (startMin < 0 || startMin > 59);

        do {
            System.out.println("Fill in the hour you stopped working. [0-23]");
            stopHour = kbd.nextInt();
        } while (stopHour < 0 || stopHour > 23);

        do {
            System.out.println("Fill in the minutes you stopped working. [0-59]");
            stopMin = kbd.nextInt();
        } while (stopMin < 0 || stopMin > 59);

        System.out.println("\nThanks, I will commence the calculation.\n...\n");

        // Calculating the total hours worked

        if (startHour > stopHour) {  // Working over midnight
            totalWorkedHours = (HOURS_IN_DAY - startHour) + stopHour;
        } else {
            totalWorkedHours = stopHour - startHour;
        }

        // Calculating the total number of minutes worked

        if (startMin <= stopMin) {  // Example 15min <= 30min -> evaluates true
            totalWorkedMinutes = stopMin - startMin;
        } else {  // Example 45min <= 30min
            totalWorkedMinutes = (MIN_IN_HOUR - startMin) + stopMin;
            totalWorkedHours--;
        }

        System.out.printf("You have worked: %d hour and %d minutes\n", totalWorkedHours, totalWorkedMinutes);

        // Calculating the total minutes worked during a shift

        allWorkTimeConvertedToMinutes = (totalWorkedHours * MIN_IN_HOUR) + totalWorkedMinutes;

        // Asking the user for the day he started working

        do {
            System.out.println("\nPlease fill in the number of the day you started working\n" +
                    "Monday [1]\nTuesday [2]\nWednesday [3]\n...\nSunday [7]");
            startDay = kbd.nextInt();
        } while (startDay < 1 || startDay > 7);

        // Default wage, if bonuses are in order they will be added in the switch
        wage = SALARY_PM * allWorkTimeConvertedToMinutes;

        // Calculate minutes after midnight, if we don't work over midnight the variable will not be used
        minutesAfterMidnight = (stopHour * MIN_IN_HOUR) + stopMin;

        switch (startDay) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                //  If working over midnight
                if (startHour > stopHour) {
                    // Calculating and adding a bonus to the default wage
                    double bonusWageSaturday = (minutesAfterMidnight * SALARY_PM) * BONUS_PERCENTAGE_25;
                    wage += bonusWageSaturday;
                }
                break;
            case 6:
                wage += wage * BONUS_PERCENTAGE_25;

                if (startHour > stopHour) {
                    // We yet again add a bonus 25% to the minutes worked after midnight so that those hours are actually 50% more
                    double bonusWageSunday = (minutesAfterMidnight * SALARY_PM) * BONUS_PERCENTAGE_25;
                    wage += bonusWageSunday;
                }
                break;
            case 7:
                wage += wage * BONUS_PERCENTAGE_50;

                if (startHour > stopHour) {
                    double noBonusMonday = (minutesAfterMidnight * SALARY_PM) * BONUS_PERCENTAGE_50;
                    wage -= noBonusMonday;
                }
        }

        System.out.printf("Your pay today is %.2f€.", wage);
    }
}
