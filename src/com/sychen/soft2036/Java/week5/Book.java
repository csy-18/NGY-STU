package soft2036.Java.week5;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Book
 * @Description TODO
 * @Author msi
 * @Date 2020-11-2
 **/
@Getter
@Setter
@Builder
public class Book {
    String ISBN;
    String bookName;
    int price;

    public Book() {
    }

    public Book(String ISBN, String bookName, int price) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }
}
