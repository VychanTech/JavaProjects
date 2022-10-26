# Interfaces in Java

In class, we talked about how an **interface** can be used to relate otherwise unrelated classes by their functionality. It also provides additional flexibility for our applications.

## Task

With your `Student` class, implement the java `Comparable` interface we discussed in class. When comparing `Student` objects, we'll use the following rules:

Suppose there are two `Student` objects, `s` and `t`, for `s.compareTo(t)`:

- if `s`'s gpa is less than `t`'s gpa, return -1
- if `s`'s gpa is greater than `t`'s gpa, return 1
- if both gpa values are equal, return 0

*Note: If you don't have a `gpa` attribute in your `Student` class, simply add one.*

Create some `Student` objects in your driver and compare them to make sure your `compareTo` method works as specified above.

## Deliverable

Commit whatever you have to this repository by the end of class time.
This commit will help determine your base grade. Additions may be committed to the repo between that time and the time we go over it in class for additional points. However, to recevie _any_ credit, the first commit must be made before class is over, unless otherwise specified.
