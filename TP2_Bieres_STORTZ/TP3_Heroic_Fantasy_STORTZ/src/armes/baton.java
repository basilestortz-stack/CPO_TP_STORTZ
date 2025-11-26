/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

/**
 *
 * @author basilestortz
 */
public class baton {
  private int age;

    public baton(String nom, int niv, int age) {
        super(nom, niv);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bâton : " + nom + " | Attaque = " + niv + " | Âge = " + age;
    }  
}
