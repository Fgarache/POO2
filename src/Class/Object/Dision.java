package Class.Object;

public class Dision {
    public void division (){
        Read_number read_number = new Read_number();
        read_number.Read_number();
        Dates dates = new Dates();
        dates.division = dates.number1 / dates.number2;
        System.out.println("Division: "+dates.number1+ "/" +dates.number2+ "=" +dates.division);


    }
}
