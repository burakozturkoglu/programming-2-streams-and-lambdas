# Streams and lambdas

In this assignment repository, you will explore Java's Stream API and lambda expressions. The assignment is divided into parts, each containing a Java class with incomplete methods. Your goal is to complete the logic of these methods using streams and lambdas. To support the exercises, we recommend the following materials:

- [The Stream API (dev.java)](https://dev.java/learn/api/streams/)
- [Lambda Expressions in Java (Coding with John, YouTube)](https://youtu.be/tj5sLSFjVj4)
- [Optionals In Java (Coding with John, YouTube)](https://youtu.be/vKVzRbsMnTQ)
- [Java 8 STREAMS Tutorial (Oggi AI, YouTube)](https://youtu.be/t1-YZ6bF-g0)
- [The Java 8 Stream API Tutorial (baeldung.com)](https://www.baeldung.com/java-8-streams)
- [Lesson examples](https://github.com/hh-programming-2/lessons?tab=readme-ov-file#lesson-5-streams-lambdas-and-optionals)

## Testing the exercises

This assignment does not include a "main program" (`main` method). Instead of a main program, the package includes [JUnit unit tests](./src/test/java/) for each part of the exercise. Familiarizing yourself with the tests is not necessary to complete the exercise, but running the tests is highly recommended to get feedback on the functionality of your solutions.

You can run the unit tests using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or the [Gradle automation tool](https://docs.gradle.org/current/userguide/java_testing.html). If you wish, you can also create your own `main` methods to test the functionality of your solutions.

> [!IMPORTANT]
> You may write additional tests if you wish, but do not modify or delete the pre-written tests.

> [!IMPORTANT]
> Changing the names, parameters, or return values of the methods and classes specified in the exercise instructions is not allowed to ensure the tests function correctly.

## Submitting the assignment

Submit the assignment using Git's `add`, `commit`, and `push` commands as you did with previous exercises. You can submit your solution for evaluation as many times as needed until the exercise deadline. However, ensure that the latest submission produces the best points, as only the most recent points will be considered.

## Part 1: IntegerStreams *(basics, 10 %)*

In this part, you will learn to utilize the ready-made methods of Java's [IntStream class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html), which perform typical arithmetic operations on streams containing only integers. You will need resources such as [Java documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html) to support this exercise.

Complete the methods in the [`IntegerStreams`](./src/main/java/part01/IntegerStreams.java) class according to their comments and hints. This part of the task is tested with the [`IntegerStreamsTest`](./src/test/java/part01/IntegerStreamsTest.java) test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests IntegerStreamsTest      # unix
.\gradlew.bat test --tests IntegerStreamsTest  # windows
```

## Part 2: OptionalValues *(basics, 10 %)*

In this section, you will learn how to handle situations where a stream may not contain any values, which should be considered when determining averages or extreme values. Java utilizes "optional" objects in such cases, which you can read more about in the Java documentation: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html), [OptionalDouble](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/OptionalDouble.html) and [OptionalInt](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/OptionalInt.html).

Complete the methods in the [`OptionalValues`](./src/main/java/part02/OptionalValues.java) class according to their comments and hints. This part of the task is tested with the [`OptionalValuesTest`](./src/test/java/part02/OptionalValuesTest.java) test class, which you can run either with your code editor's testing tool or with Gradle.

```
./gradlew test --tests OptionalValuesTest      # unix
.\gradlew.bat test --tests OptionalValuesTest  # windows
```

## Part 3: ListsAndStreams *(basics, 10 %)*

In this section, you will learn how to create streams from lists and form lists from streams.

Complete the methods in the file [ListsAndStreams.java](./src/main/java/part03/ListsAndStreams.java) according to their comments and hints. This part of the task is tested with the [ListsAndStreamsTest.java](./src/test/java/part03/ListsAndStreamsTest.java) test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests ListsAndStreamsTest      # unix
.\gradlew.bat test --tests ListsAndStreamsTest  # windows
```

## Part 4: MappingStreams *(basics, 10 %)*

In this section, you will learn how to create new streams by transforming the values of an existing stream. These transformations typically require operations implemented as lambda expressions.

Complete the methods in the file [MappingStreams.java](./src/main/java/part04/MappingStreams.java) according to their comments and hints. This part of the task is tested with the [MappingStreamsTest.java](./src/test/java/part04/MappingStreamsTest.java) test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests MappingStreamsTest      # unix
.\gradlew.bat test --tests MappingStreamsTest  # windows
```

## Part 5: FilteringStreams *(basics, 10 %)*

A very common use case for streams is filtering data. In this section, you will learn how to filter streams to include only values that meet certain conditions, which will become part of a new stream.

Complete the methods in the file [FilteringStreams.java](./src/main/java/part05/FilteringStreams.java) according to their comments and hints. This part of the task is tested with the [FilteringStreamsTest.java](./src/test/java/part05/FilteringStreamsTest.java)a test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests FilteringStreamsTest      # unix
.\gradlew.bat test --tests FilteringStreamsTest  # windows
```

## Part 6: PredicatesWithStreams *(basics, 10 %)*

In this task, you will learn how to check conditions that apply to the entire stream.

Complete the methods in the file [PredicatesWithStreams.java](./src/main/java/part06/PredicatesWithStreams.java) according to their comments and hints. This part of the task is tested with the [PredicatesWithStreamsTest.java](./src/test/java/part06/PredicatesWithStreamsTest.java) test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests PredicatesWithStreamsTest      # unix
.\gradlew.bat test --tests PredicatesWithStreamsTest  # windows
```

## Part 7: ObjectStreams *(soveltava, 10 %)*

In this section, we will apply Java streams with our own [Person](./src/main/java/person/Person.java) class. You will find that handling your own classes with streams is ultimately very similar to handling Java's built-in data types.

Complete the methods in the file [ObjectStreams.java](./src/main/java/part07/ObjectStreams.java) according to their comments and hints. This part of the task is tested with the [ObjectStreamsTest.java](./src/test/java/part07/ObjectStreamsTest.java) test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests ObjectStreamsTest      # unix
.\gradlew.bat test --tests ObjectStreamsTest  # windows
```

## Part 8: PersonStreams *(applying, 10 %)*

In this section, we will apply what we have learned to convert strings into [Person](./src/main/java/person/Person.java) objects and vice versa. We will also learn to perform operations such as increasing the age of all persons in the stream by one year.

Complete the methods in the file [PersonStreams.java](./src/main/java/part08/PersonStreams.java) according to their comments and hints. This part of the task is tested with the [PersonStreamsTest.java](./src/test/java/part08/PersonStreamsTest.java) test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests PersonStreamsTest      # unix
.\gradlew.bat test --tests PersonStreamsTest  # windows
```


## Part 9: PizzaStreams *(advanced, 20 %)*

In the final part of the task, we will work with [Pizzas](./src/main/java/pizza/Pizza.java) and pizza toppings using streams. We will focus particularly on pineapple, which is a highly controversial topping. Along the way, we will practice operations such as sorting streams.

Complete the methods in the file [PizzaStreams.java](./src/main/java/part09/PizzaStreams.java) according to their comments and hints. This part of the task is tested with the [PizzaStreamsTest.java](./src/test/java/part09/PizzaStreamsTest.java) test class, which you can run either with your code editor's testing tool or with Gradle:

```
./gradlew test --tests PizzaStreamsTest      # unix
.\gradlew.bat test --tests PizzaStreamsTest  # windows
```

## License and authors

This exercise is made by Teemu Havulinna and translated to English by Kalle Ilves and it is licensed under a [Creative Commons BY-NC-SA license](https://creativecommons.org/licenses/by-nc-sa/4.0/).

ChatGPT 3.5 language model and GitHub copilot AI assistant has been used to implement the exercise.
