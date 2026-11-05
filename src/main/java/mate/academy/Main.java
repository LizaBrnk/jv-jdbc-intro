package mate.academy;

import java.sql.Connection;
import java.util.List;
import mate.academy.lib.Injector;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConnectionUtil.getConnection();
        System.out.println("Connected successfully!");

        Injector injector = Injector.getInstance("mate.academy");
        BookDao bookDao = (BookDao) injector.getInstance(BookDao.class);

        Book book = new Book();
        //book.setTitle("Clean Code");
        //book.setPrice(new BigDecimal("500"));
        //bookDao.create(book);
        //System.out.println(book.getId());

        //Optional<Book> foundBook = bookDao.findById(1L);
        //System.out.println(foundBook);

        //Optional<Book> missingBook = bookDao.findById(999L);
        //System.out.println(missingBook);

        List<Book> books = bookDao.findAll();
        System.out.println(books.size());

        //book.setId(1L);
        //book.setTitle("Effective Java");
        //book.setPrice(new BigDecimal("700"));
        //Book updatedBook = bookDao.update(book);

        //boolean firstDelete = bookDao.deleteById(1L);
        //System.out.println(firstDelete);
    }
}
