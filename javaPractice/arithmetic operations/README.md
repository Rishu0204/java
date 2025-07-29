# Arithmetic Operations in Java


Arithmetic operations are the building blocks of calculations in Java. They use standard operators to work with numeric data types like , , .

✅ Basic Operators

- Addition
- Subtraction
- Multiplication
- Division (integer division if both operands are integers)

```java
    int add = x + y;      // Adds 5 + 10 → 15
    int sub = x - y;      // Subtracts 5 - 10 → -5
    int mul = x * y;      // Multiplies 5 * 10 → 50
    int div = y / x;      // Divides 10 / 5 → 2 (integer division truncates decimals)
```
> 📌 Note: When dividing two integers, Java performs integer division, which discards the remainder.

---
## 🎯 Type Casting for Decimal Precision
To get accurate decimal results, especially in divisions, type casting is necessary. Type casting tells Java to treat variables as a different data type (like float or double).
```java
    float div1 = (float)x / (float)y; // Converts x and y into float before division → 0.5
```
> 📌 Why cast both operands?
>
> Because if either operand remains an int, Java might still perform integer division first.

---

## 🔁 Increment and Decrement Operators

Java has shorthand operators to increase or decrease values by 1:

| Operator | Description    | Behavior                   |
|----------|----------------|----------------------------|
| x++      | Post-increment | Returns x, then increments |
| ++x      | Pre-increment  | Increments x, then returns |
| x--      | Post-decrement | Returns x, then decrements |
| --x      | Pre-decrement  | Decrements x, then returns |

```java
    int increment = x++;  // increment = 5, x becomes 6
    int z = ++x;          // x becomes 7, then z = 7
    int z1 = x++;         // z1 = 7, then x becomes 8
```

>📌 Tip to remember:
> 
>If the operator is before the variable → perform the operation first.
> 
>If it’s after → assign first, then increment/decrement.

---

## ➕ Compound Assignment Operators
These are shorthand notations for operations where a variable is updated based on its own current value.
```java
    int x1 = 0;
    x1 += 2; // Equivalent to x1 = x1 + 2 → x1 becomes 2
```

Other examples include:
- x -= y; → x = x - y
- x *= y; → x = x * y
- x /= y; → x = x / y

---

## 🧠 Recap Table – Concepts in Action

| Concept                  | Description                                        | Code Example        | Result (for x = 5, y = 10) |
|--------------------------|----------------------------------------------------|---------------------|----------------------------|
| Addition (+)             | Adds two integers                                  | x + y               | 15                         |
| Subtraction (-)          | Subtracts one integer from another                 | x - y               | -5                         |
| Multiplication (*)       | Multiplies two integers                            | x * y               | 50                         |
| Integer Division (/)     | Divides one integer by another, truncates decimals | y / x               | 2                          |
| Floating Division        | Casts integers to float before division            | (float)x / (float)y | 0.5                        |
| Post-Increment (x++)     | Returns x, then increments                         | x++                 | 5 → x becomes 6            |
| Pre-Increment (++x)      | Increments x, then returns                         | ++x                 | 7                          |
| Compound Assignment (+=) | Adds and assigns in one step                       | x1 += 2             | 2                          |


