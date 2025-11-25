/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_stortz;

/**
 *
 * @author basilestortz
 */
public class TP2_Bieres_STORTZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0 ,"Dubuisson");
        uneBiere.lireEtiquette();
       
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        deuxBiere.ouverte = false;
        deuxBiere.lireEtiquette();
        deuxBiere.Decapsuler();
       
        BouteilleBiere troisBiere = new BouteilleBiere("Heineken", 5.0, "Heineken International") ;
        troisBiere.lireEtiquette();
        troisBiere.Decapsuler();
       
       
        BouteilleBiere quatreBiere = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont") ;
        quatreBiere.lireEtiquette();
       
        BouteilleBiere cinqBiere = new BouteilleBiere("Karmeliet Triple", 8.4, "Bosteels") ;
        cinqBiere.lireEtiquette();
        cinqBiere.Decapsuler();
       
        System.out.println(uneBiere);
        System.out.println(deuxBiere);
        System.out.println(troisBiere);
        System.out.println(quatreBiere);
        System.out.println(cinqBiere);
    }

   
}
