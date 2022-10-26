# Practice with Inheritance in Java

In this exercise, you'll be practicing what we discussed on class with inheritance. Before beginning the task below, make sure you make any necessary corrections to your `Person` class based on the feedback received from Exercise 02 & 03. If you somehow still have not completed this exercise, click [here](person.md) for the details.

## Task

In class, we talked about inheriting from the `Person` class for which we made a `Teacher` class. For this exercise, you will make a `Student` class that inherits from your `Person` class. This class will have the following attributes (based on what we came up with in class):

- classification
- major

Remember that constructors in a subclass must provide parameters required by the superclass constructor. Ensure that your `Student` class has a proper constructor.

Next, override the `toString` method that the `Student` class inherits from the `Person` class. Use the `@Override` annotation to help to make sure you override the method properly.

For an extra challenge, add a `studentId` attribute that gets its value from a static variable like we did for the `vinNumber` in the `Car` class.

Be sure to compile your `Student` class and add an instance of the `Student` class to your driver to test and make sure all the values are properly set.

## Deliverable

Commit whatever you have to this repository by the end of class time.
This commit will help determine your base grade. Additions may be committed to the repo between that time and the time we go over it in class for additional points. However, to recevie _any_ credit, the first commit must be made before class is over, unless otherwise specified.
