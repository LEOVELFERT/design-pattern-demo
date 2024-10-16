package creational.abstractfactory;

//DocumentBuilderFactory is the example for the abstractFactory example.
public class ComputerFactory {
    private ComputerFactory(){}

    public static IComputer getComputer(AbstractComputerFactory abstractComputerFactory) throws IllegalAccessException {
       return abstractComputerFactory.createComputer();
    }
}
