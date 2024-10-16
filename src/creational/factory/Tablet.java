package creational.factory;

public class Tablet implements IComputer {

    private String model;
    private String processor;
    private int ram;
    private int storage;

    public Tablet(String model, String processor, int ram, int storage) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getProcessor() {
        return this.processor;
    }

    @Override
    public int getRam() {
        return this.ram;
    }

    @Override
    public int getStroage() {
        return this.storage;
    }
}
