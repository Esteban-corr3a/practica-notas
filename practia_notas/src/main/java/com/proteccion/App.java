package com.proteccion;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ValidarNotas validador = new ValidarNotas();

        System.out.print("Ingrese la nota 1: ");
        double n1 = validador.validar(sc.nextDouble());

        System.out.print("Ingrese la nota 2: ");
        double n2 = validador.validar(sc.nextDouble());

        System.out.print("Ingrese la nota 3: ");
        double n3 = validador.validar(sc.nextDouble());

        Estudiante estudiante = new Estudiante(n1, n2, n3);

        mostrarResultados(estudiante);

        sc.close();
    }

    public static void mostrarResultados(Estudiante estudiante) {

        double promedio = estudiante.calcularPromedio();
        String categoria = estudiante.clasificar(promedio);

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Nota 1: " + estudiante.getNota1());
        System.out.println("Nota 2: " + estudiante.getNota2());
        System.out.println("Nota 3: " + estudiante.getNota3());
        System.out.println("Promedio: " + String.format("%.2f", promedio));
        System.out.println("Clasificación: " + categoria);
        System.out.println("Nota más alta: " + estudiante.obtenerMayor());
        System.out.println("Nota más baja: " + estudiante.obtenerMenor());
        System.out.println(estudiante.tendencia());
    }
}