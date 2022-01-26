package Class.Object;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sum opera = new Sum();
        Operation every = new Operation();
        Subtraction subtraction = new Subtraction();
        Multiplication multi = new Multiplication();
        Dision div = new Dision();
        int option;
        Scanner option_menu = new Scanner(System.in);
        System.out.println("Select one option: ");
        System.out.println("SUM....................1");
        System.out.println("Subtraction............2");
        System.out.println("Multiplication.........3");
        System.out.println("Divisiob...............4");
        System.out.println("Every options..........5");
        System.out.println("Exit...................6");
        option = option_menu.nextInt();

        switch (option) {
            case 1: opera.Read_number();
                    opera.sum();
                    opera.result();
                    break;
            case 2: subtraction.resta();
                    break;
            case 3: multi.multi();
                    break;
            case 4: div.division();
                    break;
            case 5: every.read_number();
                    every.suma();
                    every.subtraction();
                    every.multiplication();
                    every.division();
                    every.result();
                    break;
            case 6: System.out.println("Good bye");
                    break;

        }

    }

}
