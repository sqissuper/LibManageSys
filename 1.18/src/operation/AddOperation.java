package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bl) {
        Scanner sc = new Scanner(System.in);
        System.out.println("添加图书");
        System.out.println("请输入图书的名字：");
        String name = sc.nextLine();
        System.out.println("请输入图书的作者：");
        String author = sc.nextLine();
        System.out.println("请输入图书价格：");
        int price = sc.nextInt();
        System.out.println("请输入图书的类型：");
        String type = sc.next();
        System.out.println("请输入图书的编号：");
        int num = sc.nextInt();

        Book book = new Book(name,author,price,type,num);
        int curSize = bl.getSize();//拿到长度
        bl.setBooks(curSize,book);
        bl.setSize(curSize+1);
        System.out.println("添加成功！");
    }
}
