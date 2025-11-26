/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author basilestortz
 */
public class Question {

    // Attributs privés
    private String intitule;
    private String proposition1;
    private String proposition2;
    private String proposition3;
    private String proposition4;
    private int indexBonneReponse; // compris entre 1 et 4

    // Constructeur pour initialiser tous les attributs
    public Question(String intitule, String p1, String p2, String p3, String p4, int indexBonneReponse) {
        this.intitule = intitule;
        this.proposition1 = p1;
        this.proposition2 = p2;
        this.proposition3 = p3;
        this.proposition4 = p4;

        // Vérification que l'index de la bonne réponse est correct
        if(indexBonneReponse < 1 || indexBonneReponse > 4) {
            throw new IllegalArgumentException("L'index de la bonne réponse doit être compris entre 1 et 4.");
        }
        this.indexBonneReponse = indexBonneReponse;
    }

    // Accesseurs (getters) pour l'intitulé et les propositions
    public String getIntitule() {
        return intitule;
    }

    public String getProposition1() {
        return proposition1;
    }

    public String getProposition2() {
        return proposition2;
    }

    public String getProposition3() {
        return proposition3;
    }

    public String getProposition4() {
        return proposition4;
    }

    // Accesseur pour l'index de la bonne réponse
    public int getIndexBonneReponse() {
        return indexBonneReponse;
    }
}
    

