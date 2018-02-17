/**
 * Data class that represents a person with a known name and age.
 *
 * @author Kara I
 * @version 2018-02-17
 */
public class Person implements Comparable<Person> {
    private int age;
    private String name;
    
    public Person (String n, int a) {
        age = a;
        name = n;
    }
    
    public int getAge () { return age; }
    public String getName() { return name; }
    
    public int compareTo (Person other) {
        if (!name.equals(other.name)) {
            return name.compareTo(other.name);
        } else {
            return ((Integer) age).compareTo(other.age);
        }
    }
}