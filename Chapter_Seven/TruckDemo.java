// using inheritance and super in java 

class Vehicle{
    private int passengers ; // no of passenges siting 
    private int fuelcap ; // fuel tank capacity
    private int mpg ; // mileage of vehicle miles per gallon

    // constructor for Vehicle superclass
    Vehicle(int p , int f , int m){
        passengers = p ;
        fuelcap = f ;
        mpg = m ;
    }

    // range of the vehicle at full capacity 
    int range() {
        return fuelcap * mpg ;
    }
    
    // fuel needed for distance
    double fuelneeded(int miles ) {
        return (double) miles/mpg ;
    }

    // Accessor methods for instance variables.
    int getPassengers() { 
        return passengers;
    }
    void setPassengers(int p) {
        passengers = p;
    }
    int getFuelcap() {
        return fuelcap;
    }
    void setFuelcap(int f) {
        fuelcap = f;
    }
    int getMpg() { 
        return mpg; 
    }
    void setMpg(int m) { 
        mpg = m; 
    }

}

class Truck extends Vehicle {
    private int cargocap ; // cargo capacity of truck

    // truck constructor 
    Truck(int p , int f, int m ,int c) {
        super(p,f,m) ; // initializing truck instance variable with Superclass constructor
        cargocap = c ;
    }

    // accessor methods for cargocap
    int getCargo() {
        return cargocap ;
    }
    void putCargo(int c) {
        cargocap = c ;
    }

}

public class TruckDemo {
    public static void main(String[] args ) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() +" pounds.");
        System.out.println("To go " + dist + " miles semi needs " +gallons + " gallons of fuel.\n");
        gallons = pickup.fuelneeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() +" pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +gallons + " gallons of fuel.");
        
    }    
}
