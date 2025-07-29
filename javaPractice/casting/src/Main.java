import java.lang.*;
public class Main{
    public static void main(String[] args){
        // Casting:Type casting is the process of converting a value from one data type to another.
        // In Java, this is especially important when working with different numeric types.

        // Implicit Casting: Whenever trying to convert from smaller datatype to larger data type java does that automatically or implicitly.
        //There is no data loss in implicit casting.
        // byte > short > int > long > float > double

        short x=1;
        int y=x+2;      //behind the scene java will automatically convert the x i.e 1 to int then perform the operation
        System.out.println(y);

        double x1=1.1;
        double y1=x1+2;     // here 2 which is an int is converted to double i.e 2.0 then it is added to y1
        System.out.println(y1);

        // Explicit Casting: Must be done manually when converting a larger type to a smaller type.
        // Syntax: (int) someDoubleValue
        // Can lead to data loss

        double x2 =1.1;
        int y2 =(int) x2 +2;        // here we have to explicitly cast int, java will first convert x2 to int then perform the operation
        System.out.println(y2);
        // But we cannot cast mismatching or incompatible data types eg. String->int

        String x3="1";
        int y3=Integer.parseInt(x3)+2;  // there is java class Integer in java.lang package, this takes string as parameter and parse it into desired type
        System.out.println(y3);

        // there is different Integer method for each type parseDouble,parseFloat,parseLong,etc.
        String x4="1.1";
        double y4=Double.parseDouble(x4)+2;
        System.out.println(y4);

    }
}