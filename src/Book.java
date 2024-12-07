import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = Arrays.asList(authors);
        }

    }

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.setAuthors(authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        if(this.title.compareTo(o.title) == 0){
            return Integer.compare(this.year, o.year);
        } else {
            return this.title.compareTo(o.title);
        }
    }
}
