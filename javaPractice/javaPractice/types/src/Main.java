import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Primitive datatypes: Stores simple values like numbers, strings, booleans etc.

        byte age=30;                    //1 byte range: -128,127
        boolean isEligible=true;        //1 byte range: 0/1
        float marks=90.01F;             //4 bytes
        short example=1234;             //2 bytes range: -32k,32k
        int example1=245_622_444;       //4 bytes range: -2billion,2billion
        long example2=3_123_456_789L;   //8 bytes
        double example3=1.234567;       //8 bytes
        char example4='a';              //2 bytes

        //NOTE: Both float and long needs a suffix F & L respectively otherwise they will be considered as double and int respectively.

        //Reference datatypes: Stores complex data like dates, email messages, etc.
        // When dealing with reference type we have to allocate memory, java runtime env* will not allocate memory it does for primitive datatypes

        Date now=new Date();            //This basically creates a new object Date for class Date
        System.out.println(now);
    }
}
