package Class.Object;


import java.util.Scanner;


public class Sum {

    Scanner insert = new Scanner(System.in);
    Dates dates = new Dates();

    public void Read_number (){
        System.out.println("Insert the number one: ");

        dates.number1 = insert.nextInt();

        System.out.println("Insert the  number two: ");
        dates.number2 = insert.nextInt();
    }

    public void sum () {
        dates.sum = dates.getNumber1()+ dates.getNumber2();
    }

    public void result (){
        System.out.println("sum: "+ dates.sum);
    }
}
