package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrOperation implements IOperation{
    @Override
    public void work(BookList bl) {
        System.out.println("借阅书籍");
        System.out.println("请输入需要借阅的书籍名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < bl.getSize(); i++) {
            Book book = bl.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println("请取走您要的书籍！");
                book.setStatus(true);
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你需要的书籍！");
    }
}
