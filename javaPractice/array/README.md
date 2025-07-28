# 📘 Java Arrays: Theory with Examples

---
Arrays are a fundamental data structure in Java that store multiple values of the same type in a single variable. They are fixed in size and offer fast access to elements by index.

---
## Declaring and Initializing Arrays
```bash
  int[] numbers = new int[5];
```
- Declaration: int[] numbers declares an array that can hold int values.
- Initialization: new int[5] creates an array of size 5.
- Arrays in Java are reference types. They’re stored in heap memory and must be instantiated using new.
  >📌 Important Note: Once created, the size of the array cannot be changed.
---
## Assigning Values to Arrays

```bash 
    numbers[0] = 1;
    numbers[1] = 2;
```
- Access or assign elements using zero-based indexing.
- If not explicitly assigned, numeric arrays default to 0, booleans to false, and object references to null.
---
## Printing Arrays
```bash
    System.out.println(Arrays.toString(numbers));
```
- To print array contents, use Arrays.toString() from java.util.Arrays.
- Directly printing an array will display its memory reference (not useful).
---
## Array Initialization with Known Values
```bash
    int[] numbers1 = {3, 5, 6, 2, 1};
```
- Shortcut syntax for initializing arrays when values are known.
- No need to use new or specify size manually.
---
## Sorting Arrays
```bash
    Arrays.sort(numbers1);
```
- Java provides built-in utility functions like Arrays.sort() to sort elements in ascending order.
---
## Multi-dimensional Arrays

🟦 2D Arrays
```bash
    int[][] numbers2 = new int[2][3];
    numbers2[0][0] = 1;
    numbers2[0][1] = 2;
    System.out.println(Arrays.deepToString(numbers2));
```
- Declared with two brackets: int[][].
- Arrays of arrays; like a matrix.
- Use Arrays.deepToString() for printing multidimensional arrays.


  🟦 Initializing 2D Arrays
```bash
    int[][] numbers3 = { {1, 2, 3}, {4, 5, 6} };
    System.out.println(Arrays.deepToString(numbers3));
```
- Arrays can be directly initialized with nested braces.
- Very useful for predefined data structures like grids and tables.
---
##  Higher-Dimensional Arrays
```bash
    int[][][] cube = new int[2][3][4];
```
- Just add more [] brackets to declare arrays with additional dimensions.
- These are useful in advanced scenarios like 3D simulations, image processing, etc.
---
## ✅ Summary Table

| Concept                 | Syntax                       | Example                        |
|-------------------------|------------------------------|--------------------------------|
| Declare array           | `int[] arr;`                 | `int[] arr = new int[5];`      |
| Initialize values       | `arr[i] = value;`            | `arr[0] = 10;`                 |
| Shortcut init           | `{val1, val2,...}`           | `int[] arr = {1, 2, 3};`       |
| Sort array              | `Arrays.sort(arr);`          | `Arrays.sort(numbers1);`       |
| Print array             | `Arrays.toString(arr);`      | `System.out.println(...)`      |
| Multi-dimensional array | `int[][] arr = new int[x][y];` | `int[][] grid = {{1, 2}, {3, 4}};` |




