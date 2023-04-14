package org.sanvalero;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ConversorNumerosRomanos conversor = new ConversorNumerosRomanos();
        System.out.println(conversor.convertirARomano(1));
        System.out.println(conversor.convertirARomano(10));
        System.out.println(conversor.convertirARomano(7));
        System.out.println(conversor.convertirARomano(1949));
        System.out.println(conversor.convertirARomano(2018));
    }
}