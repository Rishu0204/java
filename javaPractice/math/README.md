

## 📐 Math Class in Java 

The `Math` class in Java belongs to the `java.lang` package, which is **auto-imported**, meaning you don’t need to explicitly import it. This class provides utility methods to perform common mathematical operations on primitive types like `int`, `float`, and `double`.

---

### 🔢 `Math.max(a, b)` – Maximum Value

```java
    int maxResult = Math.max(10, 60);
    System.out.println(maxResult); // ➞ 60
```

- Returns the **larger** of the two values.
- Can accept `int`, `float`, `double`, or `long`.
- Used in scenarios like determining maximum score, max price, or thresholds.

---

### 🔽 `Math.min(a, b)` – Minimum Value

```java
    int minResult = Math.min(10, 20);
    System.out.println(minResult); // ➞ 10
```

- Returns the **smaller** of two numbers.
- Great for setting lower bounds or choosing the least value in comparison operations.

---

### 🎲 `Math.random()` – Random Value Generator

```java
    int randomResult = (int)(Math.random() * 100);
    System.out.println(randomResult); // ➞ A number between 0–99
```

- `Math.random()` returns a `double` in the range **[0.0, 1.0)**
- By multiplying it, you scale the range (`*100 → [0.0, 100.0)`).
- Type casting `(int)` trims it to whole numbers → `0–99`.

>⚠️ Always remember this is **pseudo-random** and not cryptographically secure.

---

### 🔃 `Math.round()` – Rounds to Nearest Whole Number

```java
    int roundResult = (int)Math.round(1.156);
    System.out.println(roundResult); // ➞ 1
```

- Rounds a floating-point value to the **nearest integer**.
- Returns a `long`, so you cast it when storing in an `int`.

>📌 Rounds up or down based on decimal values:  
> `Math.round(1.7) → 2`, `Math.round(1.2) → 1`

---

### ⬆️ `Math.ceil()` – Ceiling Function

```java
    int ceilResult = (int)Math.ceil(1.23);
    System.out.println(ceilResult); // ➞ 2
```

- Returns the **smallest integer greater than or equal** to the value.
- Useful for resource allocation, billing rounds, or pagination logic.

Example:  
`Math.ceil(5.001) → 6`, `Math.ceil(-5.1) → -5`

---

### ⬇️ `Math.floor()` – Floor Function

```java
    int floorResult = (int)Math.floor(1.2);
    System.out.println(floorResult); // ➞ 1
```

- Returns the **largest integer less than or equal** to the value.
- It always “rounds down.”

Example:  
`Math.floor(2.9) → 2`, `Math.floor(-3.1) → -4`

> Both `ciel()` & `floor()` returns `double` data type.
---
### ⚡ Math.pow(base, exponent) – Power Function
```java
    double result = Math.pow(2, 3); // ➞ 8.0
```
- Raises the base to the power of the exponent.
- Always returns a double, even for integer input.
- Example: Perfect for exponential growth, compound interest, etc.

---

### 📉 Math.sqrt(value) – Square Root
```java
    double result = Math.sqrt(25); // ➞ 5.0
```
- Returns the square root of the value.
- Only works with non-negative numbers.
- Ideal for geometry, distance formulas, and numerical algorithms.

---
### 💯 Math.abs(value) – Absolute Value
```java
    int result = Math.abs(-5); // ➞ 5
```
- Removes any negative sign.
- Accepts all primitive number types: int, float, double, long.
- Great for measuring error margins, distances, or delta values.

---

### More Math Methods

- `Math.log(value)` and `Math.log10(value)` – Logarithm
- `Math.sin()`, `Math.cos()`, `Math.tan()` – Trigonometric Functions
- `Math.toDegrees()` and `Math.toRadians()`

    - Easily convert between degrees and radians.

- `Math.signum(value)` – Sign Indicator

    - Returns:
      - `1.0` if value > 0
      - `-1.0` if value < 0
      - `0.0` if value == 0





---

## 📋 Summary Table – Java Math Operations

| Method           | Description                               | Example                    | Result  |
|------------------|-------------------------------------------|----------------------------|---------|
| `Math.max(a, b)` | Returns higher of two values              | `Math.max(10, 60)`         | `60`    |
| `Math.min(a, b)` | Returns lower of two values               | `Math.min(10, 20)`         | `10`    |
| `Math.random()`  | Random `double` from 0.0 to less than 1.0 | `(int)(Math.random()*100)` | `0–99`  |
| `Math.round()`   | Rounds to nearest whole number            | `Math.round(1.156)`        | `1`     |
| `Math.ceil()`    | Smallest integer ≥ value                  | `Math.ceil(1.23)`          | `2`     |
| `Math.floor()`   | Largest integer ≤ value                   | `Math.floor(1.2)`          | `1`     |
| `Math.pow(a, b)` | Raises a to the power b                   | `Math.pow(2, 3)`           | `8.0 `  |
| `Math.sqrt(a)`   | Returns square root                       | `Math.sqrt(25) `           | `5.0`   |
| `Math.abs(a)`    | Returns absolute value                    | `Math.abs(-5)`             | `5`     |
---






