package main;

import modelo.ChocolateBoiler;

public class Main {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstancia();

        boiler.llenar();
        boiler.iniciarMezcla();
        boiler.vaciar();
    }
}