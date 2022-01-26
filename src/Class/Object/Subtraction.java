package Class.Object;

public class Subtraction {

    public void resta (){
        Read_number insert = new Read_number();
        insert.Read_number();
        Dates dates = new Dates();
        dates.subtraction = dates.number1- dates.number2;
        System.out.println("Resta: "+dates.number1+ "-" +dates.number2+ "=" +dates.subtraction);


    }


}
