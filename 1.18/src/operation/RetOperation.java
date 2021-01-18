package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class RetOperation implements IOperation{
    @Override
    public void work(BookList bl) {
        System.out.println("归还图书");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要归还的书籍名字！");
        String name = sc.nextLine();
        for (int i = 0; i < bl.getSize(); i++) {
            Book book = bl.getBook(i);
            if(book.getName().equals(name)) {
                book.setStatus(false);
                System.out.println(book);
                return;
            }
        }
    }
}
