package book;

public class BookList {
    private Book[] books;
    private int size;

    public BookList() {
        this.books = new Book[10];
        books[0] = new Book("张","小张",10,"小说",01);
        books[1] = new Book("王","小王",23,"小说",03);
        books[2] = new Book("李","小李",20,"小说",02);
        this.size = 3;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }
}
