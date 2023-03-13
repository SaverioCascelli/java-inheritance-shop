package org.java.shop;

public class Cart {
    public static void main(String[] args) {
        Smartphone pro1 = new Smartphone("smartphone1","da gaming", 12,.22,"1225",12);
        System.out.println(pro1);
        Headset pro2 = new Headset("Headset1","da gaming", 12,.22,"1225","Bluetooth");
        System.out.println(pro2);
        Televison pro3 = new Televison("Television1","da gaming", 12,.22,27,true);
        System.out.println(pro3);
    }
}
