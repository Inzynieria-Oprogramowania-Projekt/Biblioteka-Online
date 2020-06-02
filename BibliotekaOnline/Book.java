public class Book {

    private String title;
    private String author_name;
    private String author_surname;
    private float price;

    public Book(String title, String author_name, String author_surname, float price){
        this.title=title;
        this.author_name=author_name;
        this.author_surname=author_surname;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_surname() {
        return author_surname;
    }
}
