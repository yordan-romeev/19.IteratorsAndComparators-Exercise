import java.util.Arrays;
import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] contents;

    public Library(Book... contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Library{" +
                "contents=" + Arrays.toString(contents) +
                '}';
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator<Book> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return this.counter < contents.length;
        }

        @Override
        public Book next() {
            return contents[counter++];
        }
    }
}
