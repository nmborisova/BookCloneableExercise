package bg.smg;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	    Book book = new Book();
        book.setTitle("Title1");
        book.setPages(200);

        Price price = new Price();
        price.setValue(35.5);
        price.setCurrency(PriceCurrency.BGN);

        book.setPrice(price);

        Author author = new Author();
        author.setName("Ime1");
        author.setSoldCopies(140000);

        book.setAuthor(author);

        Book book2 = (Book) book.clone();
        book2.setPages(300);
        book2.getAuthor().setSoldCopies(80000);

        System.out.println(book);
        System.out.println(book2);
    }
}
