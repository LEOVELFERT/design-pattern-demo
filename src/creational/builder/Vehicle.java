package creational.builder;

public class Vehicle {
    private String engine;
    private int  wheels;
    private int seats;
    private String vehicleType;


    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle Type: " + vehicleType + "\n"
                + "Engine: " + engine + "\n"
                + "Wheels: " + wheels + "\n"
                + "Seats: " + seats;
    }
}
