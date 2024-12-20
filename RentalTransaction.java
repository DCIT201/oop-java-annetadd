public class RentalTransaction {

    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays){
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public String toString(){
        return "Transaction: Customer" + customer + "rented" + vehicle + "for" + rentalDays + "days";
    }
}
