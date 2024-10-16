package creational.builder;

public class BuilderClient {
    public static void main(String[] args) {
        System.out.println("-----------car---------------------");
        Vehicle car = new CarBuilder()
                .setEngine("car-engine")
                .setWheels(4)
                .setSeats(4)
                .build();
        System.out.println(car);
        System.out.println("-----------bike--------------------");
        Vehicle bike = new BikeBuilder()
                .setEngine("bike-engine")
                .setWheels(4)
                .setSeats(4)
                .build();
        System.out.println(bike);

        VehicleDirector vehicleDirector=new VehicleDirector(new CarBuilder());
        Vehicle defaultCar = vehicleDirector.construct();
        System.out.println("-----------defaultCar---------------");
        System.out.println(defaultCar);
    }
}
