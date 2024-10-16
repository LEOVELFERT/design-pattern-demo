import creational.factory.IComputer;
import creational.factory.ComputerFactory;
import creational.factory.enums.ComputerType;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        IComputer computer = ComputerFactory.getComputer(ComputerType.valueOf("LAPTOP"), "lenova", "n75", 16, 256);
        System.out.println("The computer name is ---"+computer.getModel());
    }
}