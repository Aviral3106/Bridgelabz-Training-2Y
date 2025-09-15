

class book {
    String title;
    String author;
    double price;

    // method to display book details
    public void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        book b = new book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 499.99;

        b.displayBook();
    }
}
