/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author UTN
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Crea una matriz de 100 x 100
        int[][] matrix = new int[100][100];

        // Llena la matriz con números aleatorios
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        // Imprime la matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calcula el promedio de los números de la diagonal principal
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        int average = sum / matrix.length;

        // Imprime el promedio
        System.out.println("El promedio de los números de la diagonal principal es: " + average);
    }
}
