# Java and Kotlin Lambdas

This repo contains code snippets useful for understanding how Java and Kotlin lambdas work.

It uses Java 11 stream() calls.

Helpful Tutorials:
* [How to start working with Lambda Expressions in Java](https://medium.freecodecamp.org/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc)
* [Java Lambda Tips and Best Practices](http://www.baeldung.com/java-8-lambda-expressions-tips)

Examples:
* [Fluent Calls](src/main/java/org/athenian/lambdas/_0_fluent_calls)
* [Java Subclasses 1](src/main/java/org/athenian/lambdas/_1_subclasses_1)
* [Java Subclasses 2](src/main/java/org/athenian/lambdas/_1_subclasses_2)
* [Java Interfaces 1](src/main/java/org/athenian/lambdas/_2_interfaces_1)
* [Java Interfaces 1](src/main/java/org/athenian/lambdas/_2_interfaces_2)
* [Java Lambdas](src/main/java/org/athenian/lambdas/_3_lambdas)
* [Java Predicates](src/main/java/org/athenian/lambdas/_4_predicates)
* [Java Functions](src/main/java/org/athenian/lambdas/_5_functions)
* [Java Streams](src/main/java/org/athenian/lambdas/_6_streams)

Java Lambda Example:
```kotlin
students
    .filter { it.passing && it.averageGrade > 3.5 }     // Only passing students with high GPAs
    .sortedByDescending { it.averageGrade }             // Starting from ones with best grades
    .take(10)                                           // Take first 10
    .sortedWith(compareBy({ it.surname }, { it.name })) // Sort by surname and then name
```

