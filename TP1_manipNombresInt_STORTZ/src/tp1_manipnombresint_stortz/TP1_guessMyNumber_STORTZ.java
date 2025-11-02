/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_STORTZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        // 1️⃣ Test du générateur
        System.out.println("Cinq nombres aléatoires pour tester le générateur :");
        for (int i = 0; i < 5; i++) {
            System.out.println(generateurAleat.nextInt(101)); // nombres entre 0 et 100 inclus
        }

        // 4️⃣ Choix de difficulté
        System.out.println("Choisissez un niveau de difficulté (facile, normal, difficile, cauchemar) : ");
        String difficulte = sc.next().toLowerCase();

        int maxValue = 100;
        int maxCoups = Integer.MAX_VALUE; // illimité par défaut
        boolean modeCauchemar = false;

        switch (difficulte) {
            case "facile":
                maxValue = 50;
                maxCoups = 20;
                break;
            case "normal":
                maxValue = 100;
                maxCoups = 15;
                break;
            case "difficile":
                maxValue = 200;
                maxCoups = 10;
                break;
            case "cauchemar":
                maxValue = 100;
                maxCoups = 15;
                modeCauchemar = true;
                break;
            default:
                System.out.println("Niveau inconnu, mode normal par défaut.");
        }

        // 2️⃣ Génération du nombre à deviner
        int nombreADeviner = generateurAleat.nextInt(maxValue + 1);
        int coups = 0;
        boolean gagne = false;

        System.out.println("J'ai choisi un nombre entre 0 et " + maxValue + ". À vous de le deviner !");

        while (!gagne && coups < maxCoups) {
            System.out.print("Entrez votre proposition : ");
            int proposition = sc.nextInt();
            coups++;

            String message;

            if (proposition == nombreADeviner) {
                message = "Gagné ! Vous avez trouvé le nombre en " + coups + " tentatives.";
                gagne = true;
            } else {
                boolean inverser = false;
                // 5️⃣ Mode cauchemar : 30% de chance de donner une fausse indication
                if (modeCauchemar && generateurAleat.nextInt(100) < 30) {
                    inverser = true;
                }

                if (proposition < nombreADeviner) {
                    message = inverser ? "Trop grand !" : "Trop petit !";
                } else {
                    message = inverser ? "Trop petit !" : "Trop grand !";
                }

                // Aide supplémentaire selon l'écart
                int ecart = Math.abs(proposition - nombreADeviner);
                if (!modeCauchemar && ecart > maxValue / 2) {
                    message = "Vraiment " + message.toLowerCase();
                }
            }

            System.out.println(message);
        }

        if (!gagne) {
            System.out.println("Dommage, vous n'avez pas trouvé le nombre. C'était : " + nombreADeviner);
        }

        sc.close();
    }
}