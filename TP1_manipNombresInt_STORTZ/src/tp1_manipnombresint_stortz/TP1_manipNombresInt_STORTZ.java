/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_stortz;
import java.util.Scanner;

/**
 *
 * @author basilestortz
 */
public class TP1_manipNombresInt_STORTZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Création du scanner pour la saisie

        // 1️⃣ Saisie de deux entiers
        System.out.print("Entrez le premier entier : ");
        int nombre1 = sc.nextInt();
        System.out.print("Entrez le second entier : ");
        int nombre2 = sc.nextInt();

        // Affichage des nombres saisis
        System.out.println("Vous avez saisi : " + nombre1 + " et " + nombre2);

        // 2️⃣ Calcul et affichage de la somme, différence et produit
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;

        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence du premier moins le second est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);

        // 3️⃣ Calcul et affichage du quotient et du reste
        if (nombre2 != 0) { // Vérification pour éviter la division par zéro
            int quotient = nombre1 / nombre2;
            int reste = nombre1 % nombre2;

            System.out.println("Le quotient entier du premier par le second est : " + quotient);
            System.out.println("Le reste de la division euclidienne est : " + reste);
        } else {
            System.out.println("Division par zéro impossible !");
        }

        sc.close(); // Fermeture du scanner
    }
}
        // TOScanner sc = new Scanner(System.in); // Création du scanner


