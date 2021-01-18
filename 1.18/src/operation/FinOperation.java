package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FinOperation implements IOperation{
    @Override
    public void work(BookList bl) {
        System.out.println("查找书籍");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的书籍名字：");
        String name = sc.next();
        for (int i = 0; i < bl.getSize(); i++) {
            Book book = bl.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("有此书籍！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找的您需要的书籍！");
    }
}
