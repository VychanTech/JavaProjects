# Recursion in Java

In class, we discussed the curious concept of **recursion**, which in Java is when a method calls itself. 

## Task
Write a class named **RecursiveApp**. In this class, write a recursive method named `numOccurrences` that will return the number of times a given `char` occurs in a `String`.

This is the header for the method:

```java
public static int numOccurrences(char letter, String source, int index)
```

So your class should look like:

```java
public class RecursiveApp{
  public static int numOccurrences(char letter, String source, int index){
  
  }
}
```

Remember that when writing a recursive method, you need to think of a **base case**. This is when the method would stop calling itself, that is, when do you stop counting occurrences of the given character?

***Write your answer to this question as a comment in your code**. This must be here in order to receive full credit. Then, add your code to handle your base case.

*Hint: There are 2 base cases. Write out one of the words from the test cases on a piece of paper and figure out how you would do it, letter by letter, to count the number of times that character is in the word.*

Recursive cases are all other cases. How do you know to keep going? ***Answer this question as comments in your code.*** Then, add your code for the recursive call (remember this is when the method calls itself). 

In order to receive *any* credit at all, your solution must:

- have the exact 3 parameters given in the header
- have an explanation of your base and recursive cases
- not, under any circumstances, use a method named `substring`

If you do not give the explanation or if you use `substring` in your solution, you will receive a 0.

### Testing

To test, include a main method. Here are some example method calls you can use to see whether your code works properly:

```java
numOccurrences('p', "hippopotomonstrosesquippedaliophobia", 0) //should be 6
numOccurrences('r', "refrigerator", 0) //should be 4
numOccurrences('n', "entertainment", 0) //should be 3
numOccurrences('o', "entertainment", 0) //should be 0
numOccurrences('l', "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", 0) //should be 11
```

## Deliverable

Commit whatever you have to this repository by the end of class time. ***Please commit it to the `src/main/java` folder so that the tests in the background can run automagically.***

This commit will help determine your base grade. 

Additions may be committed to the repo between that time and the time we go over it in class for additional points. However, to recevie _any_ credit, the first commit must be made before class is over, unless otherwise specified.
