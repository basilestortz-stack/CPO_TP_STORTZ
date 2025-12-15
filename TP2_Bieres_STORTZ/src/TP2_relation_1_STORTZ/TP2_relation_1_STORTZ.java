/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_relation_1_STORTZ;

/**
 *
 * @author basilestortz
 */
public class TP2_relation_1_STORTZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissann", 4);


        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);

        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);

        System.out.println("\n" + bob + " -> Premiere voiture : " + bob.liste_voitures[0]);
        System.out.println(reno + " -> Premiere voiture : " + reno.liste_voitures[0]);
   
    }
   
}