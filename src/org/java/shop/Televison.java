package org.java.shop;

public class Televison extends Product{

    private double inch;
    private boolean smart;

    public Televison(String name, String description, double price, double tax, double inch, boolean smart) {
        super(name, description, price, tax);
        this.inch = inch;
        this.smart = smart;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String toString() {
        return "Televison{" +
                "barCode=" + getBarCode() +
                ", name='" + getName()+ '\'' +
                ", name-code'" + generateExtendedName() + '\'' +
                ", description='" + getDescription()+ '\'' +
                ", price=" + getPrice() +
                ", tax=" + getTax() +
                ", totalPrice=" + generateFormattedPrice() +
                ", inch=" + inch +
                ", smart=" + smart +
                '}';
    }
}
