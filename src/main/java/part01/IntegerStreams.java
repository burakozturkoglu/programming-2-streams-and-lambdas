package part01;

import java.util.stream.IntStream;

/**
 * This exercise is about using Java's IntStream class. IntStream is a special
 * kind of Stream that contains only integer numbers. The IntStream class
 * provides many useful methods for working with integer numbers, which you will
 * learn in this exercise.
 *
 * It is recommended that you keep the Java API documentation open while doing
 * this exercise.
 *
 * See
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/IntStream.html
 */
public class IntegerStreams {

    /**
     * Generates an inclusive range of integer numbers between the specified 'from'
     * and 'to' values.
     *
     * @param from the starting value (inclusive) of the range
     * @param to   the ending value (inclusive) of the range
     * @return an IntStream containing the numbers between 'from' and 'to'
     *         (inclusive)
     */
    public IntStream numbersBetween(int from, int to) {
        /*
         * hint: see the documentation of IntStream about how to create a range of
         * numbers. A closed range means that the 'to' value is included in the range,
         * whereas an open range does not include the 'to' value.
         */
        return null; // TODO
    }

    /**
     * Returns the sum of integers in the specified IntStream.
     *
     * @param stream the IntStream to sum
     * @return the sum of the numbers in the stream
     */
    public int sum(IntStream stream) {
        /*
         * hint: see the documentation of IntStream about how to get the sum of the
         * numbers in a stream.
         */
        return -1; // TODO
    }

    /**
     * Returns the number of values in the specified IntStream. As the number of
     * values may be larger than the int type can represent, the return type is
     * long. You can assume that the stream is not infinite, although infinite
     * streams are possible in Java.
     *
     * @param stream the IntStream to count
     * @return the number of values in the stream (which may be over
     *         Integer.MAX_VALUE)
     */
    public long countNumbersInStream(IntStream stream) {
        /*
         * hint: see the documentation of IntStream about how to count the number of
         * elements in the stream.
         */
        return -1; // TODO
    }
}
