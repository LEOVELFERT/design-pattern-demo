package creational.abstractfactory;

public class TabletComputerFactory implements AbstractComputerFactory{
    private String model;
    private String processor;
    private int ram;
    private int storage;


    public TabletComputerFactory(String model, String processor, int ram, int storage) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public IComputer createComputer() {
        return (IComputer) new Tablet(model,processor,ram,storage);
    }
}
