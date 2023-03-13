package org.java.shop;

public class Smartphone extends Product{
    private String imei;
    private int memory;

    public Smartphone(String name, String description, double price, double tax, String imei, int memory) {
        super(name, description, price, tax);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "barCode=" + getBarCode() +
                ", name='" + getName()+ '\'' +
                ", name-code'" + generateExtendedName() + '\'' +
                ", description='" + getDescription()+ '\'' +
                ", price=" + getPrice() +
                ", tax=" + getTax() +
                ", totalPrice=" + generateFormattedPrice() +
                ", imei='" + imei + '\'' +
                ", memory=" + memory +
                '}';
    }

}


