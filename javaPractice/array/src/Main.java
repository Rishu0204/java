import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] numbers=new int[5];       // array are reference type so we initialize it with new and assigning it with a size
        // size of an array is fixed and cannot be altered directly.
        numbers[0]=1;
        numbers[1]=2;
        System.out.println(Arrays.toString(numbers));       // arrays are by default assigned false value

        // arrays can be assigned directly if we already know the values
        int [] numbers1={3,5,6,2,1};
        Arrays.sort(numbers1);      // sort's array
        System.out.println(Arrays.toString(numbers1));

        // multi-dimensional array
        int[][] numbers2=new int[2][3];
        numbers2[0][0]=1;
        numbers2[0][1]=2;
        System.out.println(Arrays.deepToString(numbers2));

        // to make a 3-D array we just need to add another [] i.e int[][][] <array_name>=...

        int[][] numbers3={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers3));
    }
}