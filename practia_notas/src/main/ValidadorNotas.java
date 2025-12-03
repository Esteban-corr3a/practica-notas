package com.proteccion;

public class ValidadorNotas {

    public double validar(double nota) {

        if (nota < 0) {
            System.out.println("Nota ajustada a 0 (estaba por debajo).");
            return 0;
        }

        if (nota > 5) {
            System.out.println("Nota ajustada a 5 (estaba por encima).");
            return 5;
        }

        return nota;
    }
}