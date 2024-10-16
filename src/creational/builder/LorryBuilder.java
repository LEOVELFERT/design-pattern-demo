package creational.builder;

public class LorryBuilder implements VehicleBuilder {
    private Vehicle lorry;

    public LorryBuilder(){
        this.lorry =new Vehicle();
        this.lorry.setVehicleType("lorry");
    }

    @Override
    public VehicleBuilder setEngine(String engine) {
        lorry.setEngine(engine);
        return this;
    }

    @Override
    public VehicleBuilder setWheels(int wheels) {
        lorry.setWheels(wheels);
        return this;
    }

    @Override
    public VehicleBuilder setSeats(int seats) {
        lorry.setSeats(seats);
        return this;
    }

    @Override
    public Vehicle build() {
        return lorry;
    }
}
