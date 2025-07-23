# Anatomy Of Java (Working Of Java)

---
Functions are the smallest building block of Java.

A function is a block code that performs a task. In all programming language functions are used to execute many and all tasks eg. sending an email, converting feet's to inches,etc.

In Java Functions are creates as such:
``` bash 
    ReturnType Name(){
        ...
    }
```
- The 'ReturnType' refers to what the function will be returning.
- If a function doesn't return anything then there is a reserve keyword in java called 'void' which means that the function will not return anything.
- 'Name' is the name of your function. The name of function must be descriptive, it should that the function will do eg. sendEmail() we know it is used to send email.
- '()' is used to pass the parameters of the function eg. for sendEmail() the parameters could be senderMail,receiverMail,etc.
- '{}' your codes is written inside these parentheses.
Eg:- 
```bash
    void sendEmail(senderEmail,recevierEmail){
       \\ write youe code here
       ...
    }
```
---
Each Java Program Should Have One Function 'main()'

- main() acts as entry point to your program. Whenever you execute a Java program the main() gets called and the code inside the main() gets executed.
```bash
    void main(){
      ...
    }
```

---

A function can never act alone it should always be contained in a 'class'.
So CLASS is container of one or more related function
Thus, the classes are used to organise our code and each Java program must have one class 'Main'.
```bash
    class Main{
      void main(){
        ...
      }
    }
```
- We start with a 'class' keyword.
- Then we give class a descriptive name.
- Then curly braces. Any functions that are defined within these braces belongs to that class.

> All function within the class are called 'methods'. In other programming languages like python we can define a function outside a class those are called a function.
---
In Java all the classes and methods should have an access modifier.

An 'access modifier' are special keywords that determines whether the classes and methods in the program can be accessed by other classes and methods.

We have various access modifiers, but the most commonly used ones are 'Public' and 'Private'
```bash
    public class Main{
      public void main(){
        ...
      }
    }
```

This is the basic minimum required to make a Java program.

---
## Naming Conventions
- PascalNamingConvention: It means first letter of all words should be capital. This convention is used for naming classes.
- camelNamingConvention: It means first letter of all words should be capital except for the first word. This convention is used for naming methods.





