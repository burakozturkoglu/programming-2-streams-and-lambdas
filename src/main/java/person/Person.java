package person;

/**
 * This class represents persons. A person has a name and an age.
 *
 * The class is implemented as a Record, which is a new feature in Java 16.
 * The Record is a compact class that is used to declare classes that are used
 * mainly for storing data.
 *
 * You don't need to understand the details of the Record class, it's enough
 * that you know that it's a class that has a set of fields and
 * that it has a constructor that takes the values for thos fields as
 * parameters.
 *
 * The attributes can be accessed using the automatically generated "getter"
 * methods such as name() and age(). The Record class also has automatically
 * generated toString(), equals() and hashCode() methods.
 *
 * See more at https://dev.java/learn/records/
 */
public record Person(String name, int age) {

}
