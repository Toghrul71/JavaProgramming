package day36_Inheritance.Book;

public class Ebook extends BookParent {
    public char size;
    public int pages;


    public void setInfo(char size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println(title+" is reading a book");
    }

    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author +
                ", price=" + price + '\''+
                ", " + '\''+
                "size=" + size +'\''+
                ", pages=" + pages +'\'' +
                '}';
    }
}
