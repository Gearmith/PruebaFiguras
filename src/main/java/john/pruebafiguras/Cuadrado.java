/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.pruebafiguras;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Cuadrado {
    int lado;

    Cuadrado (int lado) {
	this.lado = lado;
    }

    double calcularArea () {
	return lado * lado;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }
}
