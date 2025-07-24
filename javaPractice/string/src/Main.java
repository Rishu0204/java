public class Main {
    public static void main(String[] args) {
        // Strings are a reference type datatype in java.
        String message = "Hello World";
        //The above statement/declaration in actuality done like,
        //String message=new String("Hello World")
        //But since the strings are one of the most commonly used datatype a easier method to declare it was made.
        System.out.println(message);

        // String Methods        Since string is a class in 'awt.* package' it has various methods
        //Concatenation
        message = "      Hello World" + "!!";
        System.out.println(message);

        //endsWith() & startsWith(): Returns true or false (Case sensitive)
        System.out.println(message.endsWith("!"));
        System.out.println(message.startsWith("hel"));

        //length()
        System.out.println(message.length());

        //indexOf()
        System.out.println(message.indexOf("llo"));     //returns the index of the first character of the argument, only the first appearance of the first character of the argument is returned
        System.out.println(message.indexOf("a"));       // when indexOf returns -1 that means the argument passed is not in the string

        //trim()
        System.out.println(message.trim());             //returns the string after removing any extra space at the beginning and at the end of the string

        //toUpperCase() & toLowerCase()
        System.out.println(message.toUpperCase());      //returns string in upper cases
        System.out.println(message.toLowerCase());      //returns string in lower cases

        //Strings in java are immutable datatypes i.e they cannot be altered
        // Therefore all the String methods returns a new string and the old string is not altered
        System.out.println(message);
    }
}