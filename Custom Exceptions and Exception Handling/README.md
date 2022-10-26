# Exception Handling in Java

In class, we discussed how to handle run-time errors, or **exceptions**, in Java. We also discussed how to write our own exception classes. In this exercise, you will practice both of these things by writing your own exception, throwing it, and then handling it.

## Task
Write an application that determines whether a given password is valid. For simplicity's sake, let's say that a valid password contains at least 8 characters. 

Write your own exception class named `PasswordException` for this. It should have at least one no-args constructor, but it is probably better if it had a constructor that accepts a parameter. 

In a "driver", ask the user to input a password. Throw your exception when the password is not at least 8 characters. Remember that the `length` method of the `String` class allows us to determine how many characters are in a given `String`. Be sure to handle the exception with a try-catch block and display the exception's **default message** when catching the exception. *Note: You can throw an exception inside of a try-catch block. Don't try to write a separate class for dealing with the password.*

For an extra challenge, let's say that passwords must also contain at least 1 uppercase letter and 1 numeric value (aka a digit). Check Chapter 9, section 9.2, Table 9-1 (page 558 in the 7th edition, 560 in the 6th) in your textbook for some helpful methods you could use. 

## Deliverable

Commit whatever you have to this repository by the end of class time.

This commit will help determine your base grade. Additions may be committed to the repo between that time and the time we go over it in class for additional points. 

However, to recevie _any_ credit, the first commit must be made before class is over, unless otherwise specified.
