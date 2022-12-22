package HW;

public class Laptop {
    private String producer;
    private String model;
    private Integer ram;
    private Integer hard_disk;
    private String os;
    private String color;

    public Laptop(String producer, String model, Integer ram, Integer hard_disk, String os, String color) {
        this.producer = producer;
        this.model = model;
        this.ram = ram;
        this.hard_disk = hard_disk;
        this.os = os;
        this.color = color;
    }
    
    
    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }
    
    public Integer getRam() {
        return ram;
    }
    
    public Integer getHard_disk() {
        return hard_disk;
    }
    
    public String getOs() {
        return os;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        return "Laptop [producer=" + producer + ", model=" + model + ", ram=" + ram + ", hard_disk=" + hard_disk
                + ", os=" + os + ", color=" + color + "]";
    }
}
