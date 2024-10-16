package creational.builder;

public interface VehicleBuilder {
    VehicleBuilder setEngine(String engine);
    VehicleBuilder setWheels(int wheels);
    VehicleBuilder setSeats(int seats);
    Vehicle build();
}
