package day36_Inheritance.Book;

public class BookParent {
    public String title;
    public String type;
    public String author;
    public int price;

    public void setInfo(String title, String type, String author, int price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "BookParent{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
