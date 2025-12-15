/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author basilestortz
 */
public class Question {

    private String intitule;
    private String proposition1;
    private String proposition2;
    private String proposition3;
    private String proposition4;
    private int indexBonneReponse; // entre 1 et 4

    /**
     * Constructeur permettant d'initialiser tous les attributs
     */
    public Question(String intitule, String proposition1, String proposition2,
                    String proposition3, String proposition4, int indexBonneReponse) {

        this.intitule = intitule;
        this.proposition1 = proposition1;
        this.proposition2 = proposition2;
        this.proposition3 = proposition3;
        this.proposition4 = proposition4;

        // On vérifie que la bonne réponse est bien entre 1 et 4
        if (indexBonneReponse < 1 || indexBonneReponse > 4) {
            throw new IllegalArgumentException("L'index de la bonne réponse doit être compris entre 1 et 4.");
        }

        this.indexBonneReponse = indexBonneReponse;
    }

    // --- ACCESSEURS (GETTERS) ---

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

    public int getIndexBonneReponse() {
        return indexBonneReponse;
    }
}