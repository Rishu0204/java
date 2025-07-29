# Constant



Constants in Java are variables whose values remain unchanged once assigned. They're crucial for improving code readability, maintainability, and preventing accidental modifications.

---

## 🔒 Declaring Constants
To define a constant in Java, use the final keyword.
```java
    public final float PI=3.14F;
```
- public: The constant can be accessed from outside the class.
- final: Makes the variable immutable.
- Naming convention: Use uppercase letters with underscores (eg. PI) for clarity.

>   public/private are access modifiers and are used to restrict the use of a variable,methods & class.
---

## 🧠 Types of Constants

Java supports several types of constants:

| Type           | Example                      | Notes                      |
|----------------|------------------------------|----------------------------|
| Integer        | final int MAX = 100;         | Whole numbers              |
| Floating-point | final double PI = 3.14;      | Decimal values             |
| Boolean        | final boolean FLAG = true;   | True/false values          |
| Character      | final char GRADE = 'A';      | Single characters          |
| String         | final String NAME = "Rishu"; | Text values                |
| Enum           | enum Color { RED, GREEN }    | Group of related constants | 

---

## ✅ Best Practices
- Group related constants in meaningful classes or enums.
- Use access modifiers (private, public) based on usage scope.
- Initialize constants at declaration or in static blocks.




