
## 🔁 Type Casting in Java – Theory with Code

Type casting is converting a variable from one data type to another, especially useful when working across numeric types or parsing strings. Java supports:

- **Implicit casting**: automatic, safe
- **Explicit casting**: manual, may lose data
- **Parsing**: converting from `String` to primitive types

---

### 🔸 Import Statement

```java
import java.lang.*;
```

> 📌 The `java.lang` package is imported automatically. 
> 
>It contains essential classes like `Integer`, `Double`, `String`, etc.  

>You don't need to explicitly import it—this is just for clarity.

---

### 🔹 Implicit Casting

```java
short x = 1;
int y = x + 2;
System.out.println(y);
```

- **Implicit casting** occurs automatically when converting a **smaller data type** to a **larger one**.
- `short` → `int` is safe and automatic.
- Here, `x` is promoted to `int` before addition.

```java
double x1 = 1.1;
double y1 = x1 + 2;
System.out.println(y1);
```

- `2` (int) is implicitly cast to `2.0` (double).
- No need to manually cast when widening data types:  
  📈 `byte → short → int → long → float → double`

> ✅ **No data loss** in implicit casting.

---

### 🔹 Explicit Casting

```java
double x2 = 1.1;
int y2 = (int) x2 + 2;
System.out.println(y2);
```

- Converting from **larger to smaller** types requires manual casting.
- `(int)x2` converts `1.1` to `1` → **decimal truncated**, this is **data loss**.
- Then adds 2 to give `3`.

>⚠️ Use explicit casting with care. Casting `double → int`, for example, removes all decimal information.

---

### 🔹 Parsing Strings to Primitives

```java
String x3 = "1";
int y3 = Integer.parseInt(x3) + 2;
System.out.println(y3);
```

- You can’t directly cast `String → int`.
- Use utility methods from wrapper classes: `Integer.parseInt()`, `Double.parseDouble()`, etc.
- `"1"` becomes `1`, then `+2` makes `3`.

```java
String x4 = "1.1";
double y4 = Double.parseDouble(x4) + 2;
System.out.println(y4);
```

- `"1.1"` is parsed to `1.1` (double), then added with `2.0` → `3.1`.

>🧠 Behind the scenes, Java calls the `parseXXX()` methods from the `java.lang` wrapper classes like `Integer`, `Double`, etc.

---

## 📋 Summary Table – Type Casting Concepts

| Type            | Description                                       | Example                              | Output     |
|------------------|---------------------------------------------------|---------------------------------------|------------|
| Implicit Casting | Automatic promotion from small to large types     | `int y = shortVal + 2`                | No data loss |
| Explicit Casting | Manual narrowing conversion; may lose precision   | `int y = (int) 1.9 + 2`               | `3`        |
| String to int    | Parsing using wrapper class method                | `Integer.parseInt("1") + 2`           | `3`        |
| String to double | Parsing using wrapper class method                | `Double.parseDouble("1.1") + 2`       | `3.1`      |

---

