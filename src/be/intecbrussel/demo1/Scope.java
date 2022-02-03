package be.intecbrussel.demo1;

public class Scope {

    public static void main(String[] args) {

        // TODO: Outer scope

        int a = 7;

        {
            // TODO: Inner scope

            a = 24;
            System.out.println("Value of a: " + a);

            int c = 34;

            {
                // TODO: Even more inner scope

                System.out.println("Value of c: " + c);
                int numb = 14;
            }

            {
//                System.out.println(numb);
            }
        }

        System.out.println("Value of a: " + a);
        // TODO: System.out.println("Value of c: " + c);
    }

}
