/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
        Найти и вывести:
        а) список книг заданного автора;
        b) список книг, выпущенных заданным издательством;
        с) список книг, выпущенных после заданного года.*/

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(int id, String title, String author, String publisher, int year, int pages, int price, String coverType) {
        books.add(new Book(id, title, author, publisher, year, pages, price, coverType));
    }

    public void printBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.toString());
            }
        }
    }

    public void printBooksByPublisher(String publisher) {
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                System.out.println(book.toString());
            }
        }
    }

    public void printBooksByYear(int year) {
        for (Book book : books) {
            if (book.getYear() >= year) {
                System.out.println(book.toString());
            }
        }
    }

    public void printBookInfo(int id) {
        books.get(id - 1).toString();
    }

}
