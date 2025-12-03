package com.proteccion;

public class Estudiante {

    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String clasificar(double promedio) {
        if (promedio >= 4.5) return "Excelente";
        if (promedio >= 3.5) return "Bueno";
        if (promedio >= 3.0) return "Aceptable";
        return "Insuficiente";
    }

    public double obtenerMayor() {
        return Math.max(nota1, Math.max(nota2, nota3));
    }

    public double obtenerMenor() {
        return Math.min(nota1, Math.min(nota2, nota3));
    }

    public String tendencia() {
        if (nota3 > nota2 && nota2 > nota1) return "Tendencia: Mejorando ⬆";
        if (nota3 < nota2 && nota2 < nota1) return "Tendencia: Empeorando ⬇";
        return "Tendencia: Estable";
    }
}