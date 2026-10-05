package utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Oh hi!
 *
 * Nice to see that you're interested in the code behind the tests. Feel free to
 * explore!
 *
 * This class contains some custom assertions that are used in the tests. The
 * default assertions provided by JUnit are not very good when it comes to
 * comparing streams, so we have implemented our own.
 *
 * The approach we have taken is to create a couple of custom assertions that
 * compare two streams. An assertion is basically a method that checks that
 * something is true. The custom assertions are basically just "wrap" the
 * streams into lists and then compare the lists.
 */
public class StreamAssertions {

    /**
     * Compares two streams and checks that they contain the same elements in the
     * same order.
     *
     * @param <T>      the type of the elements in the streams
     * @param expected the stream with the "correct" elements
     * @param actual   the actual stream to compare against the expected stream
     */
    public static <T> void assertStreamsEqual(Stream<T> expected, Stream<T> actual) {
        assertNotNull(actual, "the stream must not be null");

        List<T> expectedList = expected.toList();
        List<T> actualList = actual.toList();

        assertEquals(expectedList, actualList, "the stream must contain the correct elements");
    }

    /**
     * Compares two streams and checks that they contain the same elements in the
     * same order. This is an overloaded version of the method above that accepts
     * IntStreams instead of Streams. This is needed because the IntStream interface
     * does not extend the Stream interface. Instead, we convert the IntStreams into
     * Stream<Integer> objects and then call the method above.
     *
     * @param expected the stream with the "correct" numbers
     * @param actual   the actual stream to compare against the expected stream
     */
    public static void assertStreamsEqual(IntStream expected, IntStream actual) {
        assertNotNull(actual, "the stream must not be null");

        // the "boxed" method converts an IntStream into a Stream<Integer>
        assertStreamsEqual(expected.boxed(), actual.boxed());
    }
}
