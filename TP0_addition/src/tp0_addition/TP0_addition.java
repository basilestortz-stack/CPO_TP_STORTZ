/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_addition;

import java.util.Scanner;

/**
 *
 * @author basilestortz
 */
public class TP0_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre :");
    nb=sc.nextInt();
int nb; // nombre d'entiers à additionner
int result; // resultat
int ind; //indice
// initialisation
nb=5;
result=0;
// addition des nb premiers entiers
ind=1;
while (ind< nb) {
result=result+ind;
ind++;
}
// affichage du resultat
System.out.println("la somme des "+ nb + "entiers est:"+result); }    // TODO code application logic here
    }
    

