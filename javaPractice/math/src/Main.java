public class Main{
    public static void main(String[] args){
        //Math class in Java is defined in java.lang package, it is used to perform mathematical operations.

        int maxResult=Math.max(10,60);      // Returns max of the inputted int/float/double,.....
        System.out.println(maxResult);

        int minResult=Math.min(10,20);      // Returns min of the inputted int/float/double,...
        System.out.println(minResult);

        int randomResult = (int)(Math.random()*100);        // Return a random number b/w 0 & 1 ('* 100', will make the range from 0 & 100.
        System.out.println(randomResult);                   // .random() always returns double data type so we have to type cast it inorder to get another format.

        int roundResult =(int) Math.round(1.156);           // Returns a double data type after rounding up the inputted value.
        System.out.println(roundResult);

        int cielResult= (int) Math.ceil(1.23);              // Return the smallest whole number after the given value, it also returns double data type.
        System.out.println(cielResult);

        int floorResult = (int) Math.floor(1.2);            // Return the largest whole number before the given value, it also returns double data type.
        System.out.println(floorResult);
    }
}