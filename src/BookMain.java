/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
        Найти и вывести:
        а) список книг заданного автора;
        b) список книг, выпущенных заданным издательством;
        с) список книг, выпущенных после заданного года.*/

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Library booksList = new Library();
        booksList.addBook(1, "Moby Dick", "Melville", "Intercompany", 1951, 678, 15, "Hardcover");
        booksList.addBook(2, "Fahrenheit 451", "Bradbury", "Javol", 2010, 543, 9, "Paperback");
        booksList.addBook(3, "1984", "Orwell", "Londonboys", 1950, 237, 8, "Paperback");
        booksList.addBook(4, "Lord of the Flies", "Golding", "Bad Island", 2003, 371, 7, "Kindle");
        booksList.addBook(5, "The outsiders", "Hinton", "Intercompany", 2006, 462, 12, "Paperback");
        booksList.addBook(6, "The Grapes of Wrath", "Steinbeck", "Javol", 2006, 485, 20, "Hardcover");
        booksList.addBook(7, "The Hobbit", "Tolkien", "Bad Island", 2012, 674, 5, "Kindle");
        booksList.addBook(8, "The Lord of the rings", "Tolkien", "Bad Island", 2010, 1240, 15, "Kindle");


        boolean quit = false;
        int choice;
        Scanner sc = new Scanner(System.in);

        while (!quit) {

            printMenu();

            while (!sc.hasNextInt()) {
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter a surname: ");
                    String author = sc.nextLine();
                    booksList.printBooksByAuthor(author);
                    break;
                case 2:
                    System.out.println("Enter a publisher: ");
                    String publisher = sc.nextLine();
                    booksList.printBooksByPublisher(publisher);
                    break;
                case 3:
                    System.out.println("Enter a year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    booksList.printBooksByYear(year);
                    break;
                case 0:
                    quit = true;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Welcome to the library!"
                + "\n1. Search by author."
                + "\n2. Search by publisher."
                + "\n3. Search published above the year."
                + "\n0. Quit."
                + "\nEnter a number:");
    }
}
