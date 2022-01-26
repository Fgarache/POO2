package Class.Object;

import java.util.Scanner;

public class Operation {
    //attributes
    int num1, num2, sum, subt, multi, div;

    //methods
    public void read_number (){
        Scanner insert = new Scanner(System.in);
        System.out.println("Insert the number one: ");
        num1 = insert.nextInt();

        System.out.println("Insert the number two: ");
        num2 = insert.nextInt();
    }

    public void suma(){
        sum = num1 + num2;
    }

    public void  subtraction (){
        subt = num1 - num2;
    }

    public  void multiplication (){
        multi = num1 * num2;
    }

    public  void division (){
        div = num1 / num2;
    }

    public void result (){
        System.out.println("----------------------------------");
        System.out.println("The sum is " + sum);
        System.out.println("The Subtraction is " + subt);
        System.out.println("The Multiplication is " + multi);
        System.out.println("The Division is " + div);

        System.out.println("----------------------------------");

        System.out.println("sum: "+num1+ "+" +num2+ "="+sum);
        System.out.println("res: "+num1+ "-" +num2+ "="+subt);
        System.out.println("mul: "+num1+ "X" +num2+ "="+multi);
        System.out.println("div: "+num1+ "/" +num2+ "="+div);
        System.out.println("----------------------------------");



    }

}
