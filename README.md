# Java Lambdas

This repo contains code snippets useful for understanding Java lambdas.

## Setup
* Install [Java 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) 

## Tutorials
* [How to start working with Lambda Expressions in Java](https://medium.freecodecamp.org/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc)
* [Java Lambda Tips and Best Practices](http://www.baeldung.com/java-8-lambda-expressions-tips)
* [Java 8 Stream Tutorial](https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/)

## Examples:
* [Fluent Calls](src/main/java/org/athenian/_0_fluent_calls)
* [Subclasses 1](src/main/java/org/athenian/_1_subclasses_1)
* [Subclasses 2](src/main/java/org/athenian/_1_subclasses_2)
* [Interfaces 1](src/main/java/org/athenian/_2_interfaces_1)
* [Interfaces 1](src/main/java/org/athenian/_2_interfaces_2)
* [Lambdas](src/main/java/org/athenian/_3_lambdas)
* [Predicates](src/main/java/org/athenian/_4_predicates)
* [Functions](src/main/java/org/athenian/_5_functions)
* [Streams](src/main/java/org/athenian/_6_streams)

## Java Lambda Example
```Java
Arrays.asList("a1", "a2", "b1", "c2", "c1")
    .stream()
    .filter(s -> s.startsWith("c"))
    .map(String::toUpperCase)
    .sorted()
    .forEach(System.out::println);
```

