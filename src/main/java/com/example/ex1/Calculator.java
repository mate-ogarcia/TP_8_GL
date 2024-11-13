package com.example.ex1;

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro !");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans la calculatrice !");
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nChoisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Merci d'avoir utilisé la calculatrice. Au revoir !");
                break;
            }

            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();
            System.out.print("Entrez le deuxième nombre : ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Résultat : " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Résultat : " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Résultat : " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Résultat : " + result);
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        scanner.close();
    }
}
