package part08;

import java.util.stream.Stream;

import person.Person;

/**
 * This class applies the concepts of previous exercises with Person objects.
 * Person objects can be filtered, mapped and collected just like any other
 * objects.
 */
public class PersonStreams {

	/**
     * Returns a stream of adults in the specified stream of persons.
     * An adult is a person whose age is 18 or over.
     *
     * @param persons the stream to filter
     * @return a stream of the adults in the given stream
     */
    public Stream<Person> getAdults(Stream<Person> persons) {
        if (persons == null) {
            return Stream.empty();
        }
        return persons.filter(p -> p != null && p.age() >= 18);
    }

    /**
     * Returns a stream of new Person objects with ages incremented by one.
     *
     * @param persons the stream of objects
     * @return a stream of new Person objects with incremented ages
     */
    public Stream<Person> incrementAge(Stream<Person> persons) {
        if (persons == null) {
            return Stream.empty();
        }
        return persons.filter(p -> p != null)
                      .map(p -> new Person(p.name(), p.age() + 1));
    }

    /**
     * Returns a stream of Person objects that have been created based on the lines
     * in the specified stream of Strings. Each string contains the name and age of
     * a person separated by a comma.
     *
     * For example, the line "Ada,20" creates a person object with the name "Ada"
     * and the age 20.
     *
     * @param csvLines the stream of lines from a CSV file
     * @return a stream of Person objects
     */
    public Stream<Person> csvToPersons(Stream<String> csvLines) {
        if (csvLines == null) {
            return Stream.empty();
        }
        return csvLines.filter(line -> line != null && !line.trim().isEmpty())
                       .map(line -> {
                           String[] parts = line.split(",");
                           String name = parts[0].trim();
                           int age = Integer.parseInt(parts[1].trim());
                           return new Person(name, age);
                       });
    }
}
