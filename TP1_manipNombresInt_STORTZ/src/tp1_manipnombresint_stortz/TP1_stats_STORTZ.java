/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_manipnombresint_stortz;

/**
 *
 * @author basilestortz
 */
import java.util.Random;
import java.util.Scanner;

public class TP1_stats_STORTZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        // 1️⃣ Création du tableau pour les 6 faces du dé
        int[] de = new int[6]; // toutes les cases initialisées à 0 automatiquement

        // 2️⃣ Saisie du nombre de lancers
        System.out.print("Combien de lancers souhaitez-vous effectuer ? ");
        int m = sc.nextInt();

        // 3️⃣ Boucle pour simuler les lancers
        for (int i = 0; i < m; i++) {
            int face = generateurAleat.nextInt(6); // 0 à 5
            de[face]++; // incrémente la case correspondant à la face tirée
        }

        // 4️⃣ Affichage du tableau résultat
        System.out.println("\nRésultats bruts (nombre de fois pour chaque face) :");
        for (int i = 0; i < de.length; i++) {
            System.out.println("Face " + (i+1) + " : " + de[i]);
        }

        // 5️⃣ Affichage des résultats en pourcentage
        System.out.println("\nRésultats en pourcentage :");
        for (int i = 0; i < de.length; i++) {
            double pourcentage = (double) de[i] * 100 / m;
            System.out.printf("Face %d : %.2f%%\n", i+1, pourcentage);
        }

        sc.close();
    }
}