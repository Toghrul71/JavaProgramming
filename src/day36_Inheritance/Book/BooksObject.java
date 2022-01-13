package day36_Inheritance.Book;

public class BooksObject {
    public static void main(String[] args) {
        AudioBook audioBook=new AudioBook();
        audioBook.setInfo("Long road","Roman","Sam",5);
        audioBook.setInfo(5,"Liya");
        System.out.println(audioBook);
        audioBook.listen();
        System.out.println(audioBook);

        Ebook ebook=new Ebook();
        ebook.setInfo("Good road to Java","Comedy","Sam",5);

        ebook.setInfo('L',5);
        System.out.println(ebook);

    }
}
