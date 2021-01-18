package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    public String name;
    public IOperation[] operation;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bl) {
        this.operation[choice].work(bl);
    }
}
