package week5;

/**
 * @ClassName TestBook
 * @Description TODO
 * @Author msi
 * @Date 2020-11-2
 **/
public class TestBook {
    public static void main(String[] args) {
        Book[] books=new Book[]{
                Book.builder().ISBN("1234567891234").bookName("暴力").price(99).build(),
                Book.builder().ISBN("12345678912341").bookName("12").price(99).build(),
                Book.builder().ISBN("1234567891234").bookName("暴力").price(110).build(),
       };
        BookService bookService=new BookServiceImpl();
        for (Book book:books){
                try {
                    boolean b= false;
                    try {
                        b = bookService.putOn(book);
                    } catch (BookNameException e) {
                        e.printStackTrace();
                    }
                    if (b){
                        System.out.println(book.getBookName()+"成功上架");
                    }
                } catch (ISBNException| PriceException exception) {
                    System.err.println(exception.getMessage());
                }


        }



    }
}
