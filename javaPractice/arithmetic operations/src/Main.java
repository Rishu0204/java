public class Main{
    public static void main(String[] args){
        int x=5;
        int y=10;
        System.out.println("x="+x+" y="+y);

        int add=x+y;        // return addition of x and y
        int sub=x-y;        // returns substraction of x and y
        int mul=x*y;        // returns multiplication of x and y
        int div=y/x;        // returns division of x and y

        System.out.println("add:"+add+" sub: "+sub+" mul: "+mul+" div: "+div);
        // The division here will always result in whole numbers as in java division of two whole number is always whole number.
        // In order to get float or double values we need to type cast

        float div1=(float)x/(float)y;
        System.out.println("float div: "+div1);

        // Increment and decrement operator

        int increment= x++;
        int decrement= y--;
        System.out.println("increment:" +increment+" decrement:"+decrement);

        // Pre & Post Increment
        System.out.println("\nx pre increment: "+x);
        int z= ++x;     // Pre-increment: the value of x is first incremented and then assigned to z
        System.out.println("z: "+z);
        System.out.println("x: "+x);
        System.out.println("\nx post increment: "+x);
        int z1= x++;    // Post-increment: the value of x is first assigned to z1 and then x is incremented by 1
        System.out.println("z1: "+z1);
        System.out.println("x: "+x);
        // to remember just follow the sign if its before then increment/decrement first then assign else we first assign and then increment/decrement

        // Then same can be done for pre- and post-decrement

        int x1=0;
        x1+=2;      // any arithmetic operation can be done in similar way.
        System.out.println("\n"+x1);
    }
}