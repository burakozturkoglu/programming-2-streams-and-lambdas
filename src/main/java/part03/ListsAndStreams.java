package part03;

import java.util.List;
import java.util.stream.Stream;

/**
 * In this class, you will learn how to convert a List to a Stream and back.
 * You will also learn how to limit the number of elements in a Stream.
 *
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html#stream()
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html#toList()
 */
public class ListsAndStreams {

    /**
     * Returns a stream of all the strings in the specified list.
     *
     * @param strings the list of strings
     * @return a Stream of the same strings
     */
    public Stream<String> makeStream(List<String> strings) {
        /*
         * hint: see the documentation of List about how to create a Stream from a List.
         */
        return null; // TODO
    }

    /**
     * Returns a list of all the strings in the specified stream.
     *
     * @param stream the stream of strings
     * @return a List of the same strings
     */
    public List<String> makeList(Stream<String> stream) {
        return null; // TODO
    }

    /**
     * Returns a stream of strings in the given list. The number of strings in the
     * stream is limited by the 'count' parameter. If the list contains fewer than
     * 'count' strings, the stream will contain all the strings in the list.
     *
     * @param strings the list of strings
     * @param count   the maximum number of strings to include in the stream
     * @return a Stream containing at most 'count' strings from the list
     */
    public Stream<String> streamWithLimit(List<String> strings, int count) {
        // TODO: check the documentation of Stream!
        // If you want, you can utilize the 'makeStream()' method you implemented above.
        return null;
    }

}
