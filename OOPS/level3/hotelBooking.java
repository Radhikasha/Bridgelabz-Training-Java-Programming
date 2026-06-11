public class hotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
     hotelBooking() {
        guestName = "Radhika";
        roomType = "Standard";
        nights=  3;
    }

    //parametrized
    public hotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    //copy constructor
    hotelBooking(hotelBooking h){
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display(){
        System.out.println("GuestName: "+guestName);
        System.out.println("RoomType: "+roomType);
        System.out.println("Nights: "+nights);
    }
    
    
}
class HotelBooked
{
    public static void main(String[] args) {
        hotelBooking h1 = new hotelBooking();
        h1.guestName = "radhika";
        h1.roomType = "standard";
        h1.nights = 3;
        h1.display();

        hotelBooking h2 = new hotelBooking("Ankush","standard",5);
        h2.display();

        hotelBooking h3 = new hotelBooking(h2);
        h3.display();
        
    }
}
