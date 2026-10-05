package part04;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * In this class, you will learn how to use the map() method to transform the
 * values in a stream. You will also learn how to convert a
 * {@code Stream<Integer>} to an IntStream, that has additional methods for
 * numeric operations.
 *
 * Map is a method that is typically given a lambda expression or a method
 * reference as a parameter. The operation is applied to each element in the
 * stream, and the result of the operation is used as the new value for the
 * element. For example, if you have a stream of numbers, you can use the map()
 * method to double the values in the stream.
 *
 * The lambda expression may be a simple expression, such as x -> x * 2, or a
 * more complex expression, in which case you can define the operation as a
 * separate method and use a method reference.
 */
public class MappingStreams {

	/**
     * Returns a stream where all the numbers in the given stream are doubled
     * (multiplied by 2).
     *
     * @param numbers the stream of numbers to double
     * @return a stream of doubled numbers
     */
    public IntStream doubleValuesInStream(IntStream numbers) {
        if (numbers == null) {
            return IntStream.empty();
        }
        return numbers.map(x -> x * 2);
    }

    /**
     * Returns a stream where all the numbers in the given stream are multiplied by
     * the specified multiplier.
     *
     * @param numbers
     * @param multiplier
     * @return a stream of numbers multiplied by the multiplier
     */
    public IntStream multiplyValuesInStream(IntStream numbers, int multiplier) {
        if (numbers == null) {
            return IntStream.empty();
        }
        return numbers.map(x -> x * multiplier);
    }

    /**
     * Creates an IntStream from the specified list of integers.
     *
     * @param numbers the list of integers to convert
     * @return an IntStream containing the numbers from the list
     */
    public IntStream mapListToIntStream(List<Integer> numbers) {
        if (numbers == null) {
            return IntStream.empty();
        }
        return numbers.stream().mapToInt(Integer::intValue);
    }

    /**
     * Returns a stream where all the strings in the given stream are prefixed with
     * the specified prefix. That is, the given string is added to the beginning of
     * each string in the stream.
     *
     * For example, if the prefix is "https://", the stream
     * {"ohjelmointi2.github.io", "python-ohjelmointi.github.io"} would become
     * {"https://ohjelmointi2.github.io", "https://python-ohjelmointi.github.io"}.
     *
     * @param strings the stream of strings to prefix
     * @param prefix  the prefix to add to each string
     * @return a stream of strings with the prefix added
     */
    public Stream<String> prefixAllStrings(Stream<String> strings, String prefix) {
        if (strings == null) {
            return Stream.empty();
        }
        String validPrefix = (prefix != null) ? prefix : "";
        return strings.map(s -> validPrefix + s);
    }

    /**
     * Returns a stream where all the strings in the given stream are suffixed with
     * the specified suffix. That is, the given string is added to the end of each
     * string in the stream.
     *
     * For example, if the suffix is "@example.com", the stream {"root", "admin"}
     * would become {"root@example.com", "admin@example.com"}.
     *
     * @param strings the stream of strings to suffix
     * @param suffix  the suffix to add to each string
     * @return a stream of strings with the suffix added
     */
    public Stream<String> suffixAllStrings(Stream<String> strings, String suffix) {
        if (strings == null) {
            return Stream.empty();
        }
        String validSuffix = (suffix != null) ? suffix : "";
        return strings.map(s -> s + validSuffix);
    }

    /**
     * Returns a stream where all the strings in the given stream have the specified
     * suffix removed. For example, if the suffix is ".txt", the stream
     * {"uhat.txt", "mahdollisuudet.txt", "vahvuudet.csv"} would become {"uhat",
     * "mahdollisuudet", "vahvuudet.csv"}.
     *
     * Note that if a string in the stream does not end with the given suffix, it
     * should not be changed.
     *
     * @param strings a stream of strings
     * @param suffix  the substring to remove from the end of each string
     * @return a stream of strings with the suffix removed
     */
    public Stream<String> removeSuffix(Stream<String> strings, String suffix) {
        if (strings == null) {
            return Stream.empty();
        }
        return strings.map(s -> {
            if (suffix != null && s != null && s.endsWith(suffix)) {
                return s.substring(0, s.length() - suffix.length());
            }
            return s;
        });
    }

    /**
     * Returns a stream where all the numbers in the given stream are converted to
     * strings following the rules of the FizzBuzz game. For example, if the stream
     * contains the numbers 1, 2, 3, 4, 5, the resulting stream contains the strings
     * "1", "2", "Fizz", "4", "Buzz".
     *
     * See https://en.wikipedia.org/wiki/Fizz_buzz for more info
     *
     * @param numbers the stream of numbers to convert
     * @return a stream of strings
     */
    public Stream<String> streamFizzBuzz(IntStream numbers) {
        if (numbers == null) {
            return Stream.empty();
        }
        return numbers.mapToObj(n -> {
            if (n % 15 == 0) {
                return "FizzBuzz";
            } else if (n % 3 == 0) {
                return "Fizz";
            } else if (n % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(n);
            }
        });
    }
}
