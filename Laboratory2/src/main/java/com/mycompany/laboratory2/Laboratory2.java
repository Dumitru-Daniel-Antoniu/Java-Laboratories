package com.mycompany.laboratory2;

public class Laboratory2 {
    public static void main(String[] args) {
        Location c1 = new City("Iasi",10.0,20.0);
        System.out.println(c1);
        Location c2 = new City();
        c2.setName("Roman");
        c2.setX(40.5);
        c2.setY(30.5);
        System.out.println(c2);
        Road r1 = new Express("D24",c1,c2);
        Road r2 = new Express("D24",c1,c2);
        System.out.println(r1);
        System.out.println(c1.equals(c2));
        System.out.println(r1.equals(r2));
    }
}
