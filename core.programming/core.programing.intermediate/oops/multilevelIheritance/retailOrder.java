package multilevelIheritance;
class order{
    int orderId;
    String orderDate;

    order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus(){
        return "order Placed";
    }
}

class shippedOrder extends order{
    int trackingNumber;

    public shippedOrder(int orderId,String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus(){
        return "order Shipped";
    }

    

}

class DeliveredOrder extends shippedOrder{
String deliveryDate;
    public DeliveredOrder(int orderId,String orderDate, int trackingNumber,String deliveryDate) {
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus(){
        return "Order Delieverd";
    }

    

}

public class retailOrder {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(1, "14 july" ,2345, "20 july");
        System.out.println("Order ID: "+d.orderId);
        System.out.println("orde Date: "+d.orderDate);
        System.out.println("Tracking Number: "+d.trackingNumber);
        System.out.println("Delivery Date: "+d.deliveryDate);
        System.err.println("Order Status: "+d.getOrderStatus());

    }
    
    
}
