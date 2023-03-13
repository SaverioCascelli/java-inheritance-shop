package org.java.shop;

public class Headset extends Product{
    private String color;
    private Boolean wireless;

    public Headset(String name, String description, double price, double tax, String color, boolean wireless) {
        super(name, description, price, tax);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    @Override
    public String toString() {
        return "Headset{" +
                "barCode=" + getBarCode() +
                ", name='" + getName()+ '\'' +
                ", name-code'" + generateExtendedName() + '\'' +
                ", description='" + getDescription()+ '\'' +
                ", price=" + getPrice() +
                ", tax=" + getTax() +
                ", totalPrice=" + generateFormattedPrice() +
                ", wireless='" + wireless+ '\'' +
                ", color=" + color+
                '}';
    }
    public double getDiscount() {
        double discount = .02;
        if(!wireless){
            discount = .07;
        }
        return discount;
    }
}
