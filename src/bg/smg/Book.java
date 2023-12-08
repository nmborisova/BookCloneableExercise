package bg.smg;

public class Book implements Cloneable {
    private String title;
    private Author author;
    private int pages;
    private Price price;

    public Book(String title, Author author, int pages, Price price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public Book() {
        this.title = "";
        this.author = new Author();
        this.pages = 0;
        this.price = new Price();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book bookClone = (Book) super.clone();
        bookClone.setAuthor((Author) author.clone());
        bookClone.setPrice((Price) price.clone());
        return bookClone;
    }
}
