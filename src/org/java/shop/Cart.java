package org.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
//        Smartphone pro1 = new Smartphone("smartphone1","da gaming", 12,.22,"1225",12);
//        System.out.println(pro1);
//        Headset pro2 = new Headset("Headset1","da gaming", 12,.22,"Blue",false);
//        System.out.println(pro2);
//        Televison pro3 = new Televison("Television1","da gaming", 12,.22,27,true);
//        System.out.println(pro3);
        Scanner scan = new Scanner(System.in);
        int choice;
        boolean exit = false;
        Product prodArr[] = new Product[3];
        for (int i = 0; i < prodArr.length; i++) {

            System.out.println("Inserisci il nome del prodotto:");
            String name = scan.nextLine();
            System.out.println("Inserisci la descrizione del prodotto");
            String description = scan.nextLine();
            System.out.println("Inserisci il prezzo:");
            double price = Double.parseDouble(scan.nextLine());
            System.out.println("Inserisci l'iva:");
            double tax = Double.parseDouble(scan.nextLine());
            System.out.println("Cosa stai cercando?");
            System.out.println("Premi 1 per Smartphone, 2 per Headset, 3 per Televisione:");
            choice =   Integer.parseInt(scan.nextLine());

            switch (choice){
                case 1:{
                    System.out.println("Inserire il codice imei:");
                    String imei = scan.nextLine();
                    System.out.println("Inserire quantità memoria in GB");
                    int memory = Integer.parseInt(scan.nextLine());
                    Smartphone smart = new Smartphone(name,description,price,tax,imei,memory);
                    prodArr[i] = smart;
                    break;
                }
                case 2:{
                    System.out.println("Inserire Colore:");
                    String color = scan.nextLine();
                    System.out.println("Cuffire wireless? 1:sì , 2:no");
                    int wireChoice = Integer.parseInt(scan.nextLine());
                    boolean wired = (wireChoice == 1)? true : false;
                    Headset head = new Headset(name,description,price,tax,color,wired);
                    prodArr[i] = head;
                    break;
                }
                case 3:{
                    System.out.println("Inserire Dimensione schermo in pollici");
                    int inch = Integer.parseInt(scan.nextLine());
                    System.out.println("È una tv smart? 1:sì , 2:no");
                    int smartChoice = Integer.parseInt(scan.nextLine());
                    boolean smart = (smartChoice == 1) ? true : false;
                    Televison tv = new Televison(name,description,price,tax,inch,smart);
                    prodArr[i] = tv;
                }
                default:{
                    break;
                }
            };

        }
        System.out.println("Possiedi una carta fedeltà? 1:sì , 2:no");
        int fedelity = Integer.parseInt(scan.nextLine());
        boolean boolFedelity = fedelity == 1 ? true : false;
        double totalPrice = 0;
        for (int i = 0; i < prodArr.length; i++) {
            System.out.println(prodArr[i]);
            if(boolFedelity){
                totalPrice += prodArr[i].discountedPrice();
                System.out.println("Premium discount " + prodArr[i].getDiscount() * 100 +  "%");
            }else totalPrice += prodArr[i].generateTaxedPrice();
        }
        System.out.println("Utente " + (boolFedelity ? "Premium" : "Standard"));
        System.out.println("Totale Carrello : " + totalPrice + "€");
        scan.close();

    }
}
