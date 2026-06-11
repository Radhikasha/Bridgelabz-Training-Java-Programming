public class booking {
    String movieName;
    int seatNo;
    double price;
    boolean isBooked;


    public booking(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }


    void bookingProcess(int seatNo, double price) {
        if (!isBooked) {
            this.seatNo = seatNo;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }
    void display() {
        System.out.println("Movie Name: " + movieName);
        if (isBooked) {
            System.out.println("Seat Number: " + seatNo);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }
}

class input3 {
    public static void main(String[] args) {
        booking b = new booking("Dhurander");

        b.display();                
        b.bookingProcess(8, 345);   
        b.display();               
    }
}