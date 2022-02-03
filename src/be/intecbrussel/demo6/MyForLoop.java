package be.intecbrussel.demo6;

public class MyForLoop {

    public static void main(String[] args) {

        // TODO: Part 1

        int x = 0;

        while (x < 10) {
            System.out.println(x);
            x++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        /*
        for ([1] initialization;  [2] condition [5]; [4]increment) {
            [3] statements
        }
         */

        // TODO: Part 2

        int i = 0;

        for (; i < 10; i++) {
            System.out.println(i);
        }

        // TODO: Part 3

        i = 0;
        int test = 0;

        for(; i <= 10; test = i - 5) {
            System.out.println(i++);
        }

        System.out.println(test);

        // TODO: Part 4

        i = 0;

        for (; ;) {
            System.out.println(i);
            if (i == 10) {
                System.out.println("Break loop");
                break;
            }
            i++;
        }

    }

}
