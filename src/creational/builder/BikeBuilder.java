package creational.builder;

public class BikeBuilder implements VehicleBuilder {
    private Vehicle bike;

    public BikeBuilder(){
        this.bike =new Vehicle();
        this.bike.setVehicleType("bike");
    }

    @Override
    public VehicleBuilder setEngine(String engine) {
        bike.setEngine(engine);
        return this;
    }

    @Override
    public VehicleBuilder setWheels(int wheels) {
        bike.setWheels(wheels);
        return this;
    }

    @Override
    public VehicleBuilder setSeats(int seats) {
        bike.setSeats(seats);
        return this;
    }

    @Override
    public Vehicle build() {
        return bike;
    }
}
