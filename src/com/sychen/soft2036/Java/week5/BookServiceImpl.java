package week5;

import java.util.regex.Pattern;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author msi
 * @Date 2020-11-2
 **/
public class BookServiceImpl implements BookService {
    @Override
    public boolean putOn(Book book) throws ISBNException, PriceException, BookNameException {
        Pattern pattern = Pattern.compile("[0-9]*");
        String isbn = book.getISBN();
        String bookName = book.getBookName();
        int price = book.getPrice();
        System.out.println(pattern.matcher(isbn).matches());
        if (isbn.length() != 13 || !pattern.matcher(isbn).matches()) {
            throw new ISBNException(bookName + "不是由13位数字组成");
        } else if (bookName.contains("暴力") || bookName.contains("恐怖")) {
            throw new BookNameException(bookName + "书中含有违禁词");
        } else if (price > 100) {
            throw new PriceException(bookName + "价格超过100元");
        } else {
            return false;
        }

    }
}
