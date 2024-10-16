package creational.factory;

import creational.factory.enums.ComputerType;

//Factory pattern is a design pattern which helps to get the instance
// by passing the input to this static method.
//by doing this we can avoid the method create the loosely copuled
// classes for the client based on the input they have provided.
public class ComputerFactory {
    private ComputerFactory(){}

    public static IComputer getComputer(ComputerType computerType, String model,
                                        String processor, int ram, int storage) throws IllegalAccessException {
        return switch (computerType) {
            case LAPTOP -> new Laptop(model, processor, ram, storage);
            case MOBILE -> new Moblie(model, processor, ram, storage);
            case TABLET -> new Tablet(model, processor, ram, storage);
            default -> throw new IllegalAccessException("computer type is not match with our system");
        };
    }
}
