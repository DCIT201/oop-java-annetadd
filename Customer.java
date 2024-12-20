import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
     private String name;
     private List<String> rentalHistory;


     public Customer(String customerId, String name){
         this.customerId = customerId;
         this.name = name;
         this.rentalHistory = new ArrayList<>();
     }

     public void addVehicleRentalToHistory(String vehicleId){
         rentalHistory.add(vehicleId);
     }
     public boolean isEligibleForRental(){
         return rentalHistory.size() < 5;
     }

     public String toString(){
         return "Customer ID:" + customerId + ",Name:" + name;
     }
}
