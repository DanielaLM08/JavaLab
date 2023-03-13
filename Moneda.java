/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moneda;

import java.util.Scanner;

public class Moneda {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
     
        // Pedir al usuario el monto en pesos chilenos
        System.out.print("Ingrese el monto en pesos chilenos: ");
        int montoCLP = scanner.nextInt();
        
        // Pedir al usuario los valores de las monedas extranjeras
        System.out.print("Ingrese el valor en dólares: ");
        int dolares = scanner.nextInt();
        System.out.print("Ingrese el valor en euros: ");
        int euros = scanner.nextInt();
        System.out.print("Ingrese el valor en pesos argentinos: ");
        int pesosARG = scanner.nextInt();
        
        // Calcular
        int USD = montoCLP / dolares;
        int EUR = montoCLP / euros;
        int ARG = montoCLP / pesosARG;
        
        // Mostrar los resultados
        System.out.println("El equivalente en dólares es: $" + USD);
        System.out.println("El equivalente en euros es: €" + EUR);
        System.out.println("El equivalente en pesos argentinos es: $" + ARG);
    }
}




