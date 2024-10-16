package creational.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args) throws IllegalAccessException {
        IComputer computer = ComputerFactory
                .getComputer(new LaptopComputerFactory("lenova", "octo", 2, 256));
        System.out.println("the computer is "+computer);
    }
}
