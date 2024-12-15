/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulo;

/**
 *
 * @author 50494
 */
public class Rectangulo {
    // Atributos
    public double base;
    public double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    public double calcularArea() {
        return base * altura;
    }

    public static void main(String[] args) {
        // Crear un objeto de tipo Rectangulo usando el constructor
        Rectangulo rectangulo = new Rectangulo(10, 5);

        // Llamar al método calcularArea y mostrar el resultado
        double area = rectangulo.calcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }
}