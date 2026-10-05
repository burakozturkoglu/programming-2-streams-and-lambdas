package part05;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Filtering streams is a common operation. For example, you may want to make a
 * stream that only contains numbers or strings that meet certain criteria.
 *
 * In this exercise, you will learn how to filter streams using the filter()
 * method. Like the map() method, the filter() method typically takes a lambda
 * expression or a method reference as a parameter. The result of the lambda
 * expression must be a boolean value. If the result is true, the element is
 * included in the resulting stream. If the result is false, the element is
 * filtered out.
 */
public class FilteringStreams {

    /**
     * Returns a stream that only contains the even numbers from the specified
     * stream.
     *
     * @param numbers the stream of numbers
     * @return a stream of even numbers in the same order as in the original stream
     */
    public IntStream filterEvenNumbers(IntStream numbers) {
        // hint: use the filter() method to filter out the odd numbers.
        return null; // TODO
    }

    /**
     * Returns a stream that only contains numbers between the specified 'min' and
     * 'max' values (inclusive). The numbers in the returned stream must be in the
     * same order as in the original stream.
     *
     * @param numbers the stream of numbers
     * @param min     the minimum value (inclusive)
     * @param max     the maximum value (inclusive)
     * @return a stream of numbers between min and max (inclusive) in the same order
     */
    public IntStream filterNumbersBetween(IntStream numbers, int min, int max) {
        // hint: use the filter() method to only include numbers between min and max
        return null; // TODO
    }

    /**
     * Returns a stream that only contains strings that start with the specified
     * prefix. For example, if the prefix is "@", the new stream contains words like
     * "@ohjelmointi2" and "@python-ohjelmointi" but not words like "java",
     * "stream" or "lambda".
     *
     * @param strings the stream of strings
     * @param prefix  the prefix that the strings must start with
     * @return a stream of strings that start with the specified prefix
     */
    public Stream<String> filterStringsStartingWith(Stream<String> strings, String prefix) {
        // hint: use the filter() method to only include strings that start with the
        // specified prefix.
        return null; // TODO
    }

    /**
     * Returns a stream that only contains strings that contain the specified
     * substring. For example, if the substring is "ham", the new stream
     * contains words like "ham", "hamster" and "hammock" but not words like
     * "java", "stream" or "lambda".
     *
     * @param strings the stream of strings
     * @param include the substring that the strings must contain
     * @return a stream of strings that contain the specified substring
     */
    public Stream<String> filterIncludingSubstring(Stream<String> strings, String include) {
        return null; // TODO
    }

    /**
     * Returns a stream that only contains strings that do not contain the
     * specified substring. For example, if the substring is "ham", the new
     * stream contains words like "java", "stream" and "lambda" but not words
     * like "ham", "hamster" or "hammock".
     *
     * @param strings the stream of strings
     * @param exclude the substring that the strings must not contain
     * @return a stream of strings that do not contain the specified substring
     */
    public Stream<String> filterNotIncludingSubstring(Stream<String> strings, String exclude) {
        return null; // TODO
    }
}
