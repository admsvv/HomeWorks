package com.softserve.academy.homework_1;

import java.lang.*;

enum Continent {
    AFRICA, ASIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, AUSTRALIA;
}
public class Main {
    public static void main(String[] args) {

        Continent continent = Continent.SOUTH_AMERICA;

        switch (continent) {
            case AFRICA:
                System.out.println("Algeria, " + "Benin, " + "Kenya");
                break;
            case ASIA:
                System.out.println("Afghanistan, " + "Japan, " + "Kuwait");
                break;
            case EUROPE:
                System.out.println("Ukraine, " + "Italy, " + "Albania");
                break;
            case NORTH_AMERICA:
                System.out.println("U.S.A., " + "Canada, " + "Panama");
                break;
            case SOUTH_AMERICA:
                System.out.println("Bolivia, " + "Argentina, " + "Uruguay");
                break;
            case AUSTRALIA:
                System.out.println("Australia");
                break;
            case ANTARCTICA:
                System.out.println("No countries ...");
        }
    }
}