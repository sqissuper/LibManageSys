package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bl) {
        System.out.println("删除图书");
        System.out.println("请输入需要删除的书籍名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int i = 0;
        for (; i < bl.getSize(); i++) {
            Book book = bl.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i >= bl.getSize()){
            System.out.println("没有找到此书籍");
            return;
        }
        int j = i;
        for(; j < bl.getSize() - 1; j++){
            Book book = bl.getBook(j + 1);
            bl.setBooks(j,book);
        }
        int cueSize = bl.getSize();
        bl.setSize(cueSize-1);
        System.out.println("成功删除此书籍！");
    }
}
