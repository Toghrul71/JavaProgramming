package day36_Inheritance.Book;

public class AudioBook extends BookParent {
    public int length;
    public String narrator;

    public void setInfo(int length, String narrator) {
        this.length = length;
        this.narrator = narrator;

            }
    public void listen(){
        System.out.println("I am listening to "+ title);
    }

    public String toString() {
        return "AudioBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author +
                ", price=" + price + '\''+
                ", " + '\''+
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
