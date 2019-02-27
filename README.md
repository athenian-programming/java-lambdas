# Java and Kotlin Lambdas

This repo contains code snippets useful for understanding how Java and Kotlin lambdas work.

Helpful Tutorials:
* [How to start working with Lambda Expressions in Java](https://medium.freecodecamp.org/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc)
* [Java Lambda Tips and Best Practices](http://www.baeldung.com/java-8-lambda-expressions-tips)
* [Kotlin Lambda Expressions](http://www.baeldung.com/kotlin-lambda-expressions)
* [Lambdas with a Context](https://proandroiddev.com/kotlin-pearls-lambdas-with-a-context-58f26ab2eb1d)

Lambda Example:
```kotlin
students
    .filter { it.passing && it.averageGrade > 4.0 }     // Only passing students
    .sortedByDescending { it.averageGrade }             // Starting from ones with best grades
    .take(10)                                           // Take first 10
    .sortedWith(compareBy({ it.surname }, { it.name })) // Sort by surname and then name
```