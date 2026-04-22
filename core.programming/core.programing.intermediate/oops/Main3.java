class Book{
    String title;
    String author;
    int price;

       Book() {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);

    }
    
}

public class Main3 {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "MATHS";
        b.author = "James Gosling";
        b.price = 230;
        b.display();

        
    }
}
