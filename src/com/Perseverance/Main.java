package com.Perseverance;

public class Main {

    public static void main(String[] args) {
        Mazo mazo = new Mazo();

        for (int i = 0; i < mazo.getMazo().size(); i++) {

            System.out.println(mazo.getMazo().get(i).toString());

        }

        System.out.println(mazo.getUltimaCarta().toString());

    }
}
