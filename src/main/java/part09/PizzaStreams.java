package part09;

import java.util.List;
import java.util.stream.Stream;

import pizza.Pizza;

/**
 * Pineapple is a controversial pizza topping. Some people love it, some people
 * hate it. Some people even think that it's a crime against humanity to put
 * pineapple on a pizza.
 *
 * In this exercise you will implement a few methods that can be used to select
 * pizzas based on their personal preferences.
 */
public class PizzaStreams {

    /**
     * Returns a stream of pizzas that have "pineapple" as a topping.
     *
     * @param pizzas a stream of pizzas
     * @return a stream of pizzas that have "pineapple" as a topping
     */
    public Stream<Pizza> getPizzasWithPineapple(Stream<Pizza> pizzas) {
        /*
         * You must use the filter() method of the Stream to select the pizzas that have
         * "pineapple" as a topping.
         *
         * You can use the toppings() method of a Pizza to get the toppings as a
         * list of strings.
         */
        return null; // TODO: implement this method
    }

    /**
     * Returns a stream of pizzas that do not have "pineapple" as a topping.
     *
     * @param pizzas a stream of pizzas
     * @return a stream of pizzas that do not have "pineapple" as a topping
     */
    public Stream<Pizza> getPizzasWithoutPineapple(Stream<Pizza> pizzas) {
        /*
         * Like the previous method, but this time you must select the pizzas
         * that do not have "pineapple" as a topping.
         */
        return null; // TODO: implement this method
    }

    /**
     * Returns a stream of pizzas that have the given topping. Toppings are
     * always in lower case.
     *
     * @param pizzas  a stream of pizzas
     * @param topping the topping to look for
     * @return a stream of pizzas that have the given topping
     */
    public Stream<Pizza> getPizzasWithTopping(Stream<Pizza> pizzas, String topping) {
        /*
         * Like the previous method, but this time you must select the pizzas
         * that have the given topping. You can assume that toppings are
         * always in lower case.
         */
        return null; // TODO: implement this method
    }

    /**
     * Returns a stream of pizzas that have any of the toppings given as the
     * second parameter. Toppings are always in lower case.
     *
     * @param pizzas   a stream of pizzas
     * @param toppings the toppings to look for
     * @return a stream of pizzas that have any of the given toppings
     */
    public Stream<Pizza> getPizzasWithAnyOfToppings(Stream<Pizza> pizzas, List<String> toppings) {
        /*
         * Like the previous method, but this time you must select the pizzas
         * that have any of the given toppings. You can assume that toppings are
         * always in lower case.
         *
         * Hint: you can define another method that checks if a pizza has any
         * of the given toppings and then use that method here. You are also allowed to
         * add new methods in the Pizza class.
         */
        return null; // TODO: implement this method
    }

    /**
     * Returns a stream of pizzas that is sorted by price in ascending order
     * (cheapest first). If two pizzas have the same price, they can be in
     * any order.
     *
     * @param pizzas a stream of pizzas
     * @return a stream of pizzas that is sorted by price in ascending order
     */
    public Stream<Pizza> sortPizzasByPrice(Stream<Pizza> pizzas) {
        /*
         * You must use the sorted() method of the Stream interface to sort
         * the pizzas by price.
         *
         * https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/stream
         * /Stream.html#sorted(java.util.Comparator)
         */
        return null; // TODO: implement this method
    }

    /**
     * Returns a stream of pizzas that is sorted by name in alphabetical order.
     *
     * @param pizzas a stream of pizzas
     * @return a stream of pizzas that is sorted by name in alphabetical order
     */
    public Stream<Pizza> sortPizzasByName(Stream<Pizza> pizzas) {
        /*
         * Like the previous method, but this time you must sort the pizzas
         * by their name in alphabetical order.
         *
         * Names can be in any casing (upper, lower or mixed). You may want to use the
         * compareToIgnoreCase() method of the String class to compare the names of the
         * pizzas.
         */
        return null; // TODO: implement this method
    }
}
