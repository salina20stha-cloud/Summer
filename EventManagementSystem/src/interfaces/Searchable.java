package interfaces;

/*
 * Interface demonstrating the
 * Interface Segregation Principle (ISP).
 * Repository classes can implement this interface.
 */

public interface Searchable<T> {

    T searchById(int id);

}