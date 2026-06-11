public class product {
    String productName;
    int price;
    static int totalProducts = 0;

    public product() {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    void displayTotalProducts(){
        System.out.println("Total Products are: "+totalProducts);
    }

    
    
}
class totalproduct{
    public static void main(String[] args) {
        product p = new product();
        p.productName = "bag";
        p.price = 300;
        p.displayProductDetails();
        p.displayTotalProducts();

        product p1 = new product();
        p1.productName = "Bottle";
        p1.price = 600;
        p1.displayProductDetails();
        p1.displayTotalProducts();

        product p2 = new product();
        p2.price = 1000;
        p2.productName = "earbuds";
        p2.displayProductDetails();
        p2.displayTotalProducts();
    }
}
