public class Vehicle{
    final int registrationNumber;
 static int registrationFee;
 String ownerName;
 String vehicleType;
 //final int registrationNumber;
 Vehicle(int registrationFee,String ownerName, String vehicleType,int registrationNumber){
    this.registrationFee = registrationFee;
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
    this.registrationNumber = registrationNumber;

 }
 void display(){
    System.out.println("Registration fee: "+registrationFee);
    System.out.println("Owner Name: "+ownerName);
    System.out.println("Vehicle Type: "+vehicleType);
    System.out.println("Registration Number: "+registrationNumber);

 }




 static void updateRegistrationFee(int rf){
    System.out.println("Upadting Registration Fees is: "+rf);

 }

}
class vehicle2{
    public static void main(String []args){
        
        Vehicle v = new Vehicle(1500,"Radhika","Two",12345);
        Vehicle v1 = new Vehicle(1200, "Aashu","one",1234);

        if(v instanceof Vehicle){
            v.display();

        }
        if(v1 instanceof Vehicle){
            v1.display();
        }
        v.updateRegistrationFee(100);


    }
}