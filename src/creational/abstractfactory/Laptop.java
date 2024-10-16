package creational.abstractfactory;


public class Laptop implements IComputer {

    private String model;
    private String processor;
    private int ram;
    private int storage;

    public Laptop(String model, String processor, int ram, int storage) {
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

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
