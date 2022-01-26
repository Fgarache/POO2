package Class.Object;

import java.util.Scanner;

public class Read_number {
    Scanner insert = new Scanner(System.in);
    Dates dates = new Dates();
    public void Read_number (){
        System.out.println("Insert the number one: ");

        dates.number1 = insert.nextInt();

        System.out.println("Insert the  number two: ");
        dates.number2 = insert.nextInt();
    }
}
