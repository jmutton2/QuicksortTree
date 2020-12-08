import java.util.NoSuchElementException;

public interface Iterator<K> {

    public boolean hasNext() throws NoSuchElementException;
    public K next() throws NoSuchElementException;
    public void remove() throws NoSuchElementException;

}