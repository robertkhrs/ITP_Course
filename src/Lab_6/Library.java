package Lab_6;


public class Library {
    static void main(String[] args) {
        Book book = new Book();
        System.out.println("Book's info:");
        System.out.println(" - name: " + book.name);
        System.out.println(" - Author: " + book.author.name);
        System.out.println(" - price: " + book.price + "$");
        System.out.println(" - quantity: " + book.price + "\n");
        System.out.println("Author's info: ");
        System.out.println(" - name: " + book.author.name);
        System.out.println(" - email: " + book.author.email);
        System.out.println(" - gender: " + book.author.gender);
    }
}

class Author {
    String name = "Very popular author";
    String email = "email@innopolis.university";
    char gender = 'M';
}

class Book {
    String name = "Very interesting book";
    Author author = new Author();
    double price = 999999.99;
    int qty = 10;
}
