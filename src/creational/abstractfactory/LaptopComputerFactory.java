package creational.abstractfactory;

public class LaptopComputerFactory implements AbstractComputerFactory{
    private String model;
    private String processor;
    private int ram;
    private int storage;

    public LaptopComputerFactory(String model, String processor, int ram, int storage) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public IComputer createComputer() {
        return (IComputer) new Laptop(model,processor,ram,storage);
    }
}
