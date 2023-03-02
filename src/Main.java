import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<>();
        Book book1=new Book("Rich dad poor dad",396,"Robert Kiyosaki",2013);
        Book book2=new Book("Harward business review",296,"Harward business review press",2018);
        Book book3=new Book("Altı diriliş",456,"Mur Lafferty",2019);
        Book book4=new Book("Akıl okuma santı",294,"Henrik Fexeus",2016);
        Book book5=new Book("Enistein gibi düşünmek",192,"Peter Hollins",2020);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        System.out.println("Kitaplar");
        System.out.println("--------------------");
        for (Book b:books){
            System.out.println(b.getBookName());
        }
        System.out.println("sayfa sayılarına göre sıralanırsa");
        System.out.println("--------------------");
        TreeSet<Book> compBooks=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPage()- o1.getPage();
            }
        });
        compBooks.addAll(books);
        for (Book b2:compBooks){
            System.out.println(b2.getBookName());
        }
    }
}