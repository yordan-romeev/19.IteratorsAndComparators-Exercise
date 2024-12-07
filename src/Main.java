public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Title1", 1990, "Author1", "Author 2");
        Book book2 = new Book("Title2", 1980, "Author3");
        Book book3 = new Book("Title3", 1970);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Library<Book> library = new Library<>(book1, book2, book3);
        System.out.println(library);




    }
}