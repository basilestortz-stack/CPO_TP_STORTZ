/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_stortz;

/**
 *
 * @author basilestortz
 */
public class BouteilleBiere {
     String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
       
}
    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La biere " + nom + " est maintenant ouverte !"+"\n");
            return true;
        }
        else {
            System.out.println("Erreur : la biere " + nom + " est deja ouverte !"+"\n");
            return false;
        }
    }
    public void lireEtiquette(){
        System.out.println("bouteille de "+ nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie+"\n") ;
    }
    @Override

    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";  
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;  
}
}
    

