package pizza;

import java.util.List;

/**
 * This class represents pizzas. A pizza has a name and a price as well as
 * a list of toppings. Each topping is represented by a string, which you
 * can assume is always in lower case.
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
 * methods such as name(), price() and toppings(). The Record class also also
 * has automatically generated toString(), equals() and hashCode() methods.
 *
 * See more at https://dev.java/learn/records/
 */
public record Pizza(String name, double price, List<String> toppings) {

}
