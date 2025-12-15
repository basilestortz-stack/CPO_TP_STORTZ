/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

/**
 *
 * @author basilestortz
 */
public class epee {
      int finesse;
    public epee(String nom, int niv, int fine) {
        super(nom, niv);
        if (finesse < 100)
            this.finesse = fine;
        else
            this.finesse =99;
    }
    public int getfinesse() {
        return finesse;
    }
     @Override
    public String toString() {
        return super.toString() + " | Finesse : " + finesse;
    }
    
}
