package Class.Object;

public class Multiplication {
    public void multi (){
        Read_number insert = new Read_number();
        insert.Read_number();
        Dates dates = new Dates();
        dates.multiplication = dates.number1 * dates.number2;
        System.out.println("Multiplication: "+dates.number1+ "X" +dates.number2+ "=" +dates.multiplication);
    }

}
