package soft2036.Java.week5;

/**
 * @ClassName MyBook
 * @Description TODO
 * @Author msi
 * @Date 2020-11-2
 **/
public interface BookService {
    boolean putOn(Book book) throws ISBNException, PriceException, BookNameException;
}
