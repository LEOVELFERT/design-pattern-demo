package creational.builder;

public class CarBuilder implements VehicleBuilder {

    private Vehicle car;

    public CarBuilder(){
        this.car =new Vehicle();
        this.car.setVehicleType("car");
    }

    @Override
    public VehicleBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public VehicleBuilder setWheels(int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public VehicleBuilder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public Vehicle build() {
        return car;
    }
}
