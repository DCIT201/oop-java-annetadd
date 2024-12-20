public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C2025", "Lexus", 25.0);
        Vehicle motorcycle = new Motorcycle("MX2021", "BMW", 20.0);
        Vehicle truck = new Truck("T2020","Toyota",35.0);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer1 = new Customer("10010","Fifi");
        Customer customer2 = new Customer("10011","Sheila");


        agency.rentVehicle(customer1,"Lexus",2);
        agency.rentVehicle(customer2,"Toyota",1);

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(truck);



    }
}
