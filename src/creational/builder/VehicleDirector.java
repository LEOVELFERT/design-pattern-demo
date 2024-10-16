package creational.builder;

public class VehicleDirector {
    private VehicleBuilder vehicleBuilder;

    public VehicleDirector(VehicleBuilder vehicleBuilder){
        this.vehicleBuilder=vehicleBuilder;
    }

    public Vehicle construct(){
        return new CarBuilder()
                .setEngine("Car-Engine")
                .setSeats(4)
                .setWheels(4)
                .build();
    }

}
