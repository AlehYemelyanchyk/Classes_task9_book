/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
        Найти и вывести:
        а) список книг заданного автора;
        b) список книг, выпущенных заданным издательством;
        с) список книг, выпущенных после заданного года.*/

public class Book {

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private String coverType;

    public Book(int id, String title, String author, String publisher, int year, int pages, int price, String coverType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book " + id + ": " + title + " by " + author + ". Publisher: " + publisher + ", " + year +
                ". " + pages + " pages. Price: " + price + "$." + " Cover type: " + coverType + ".\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }
}
