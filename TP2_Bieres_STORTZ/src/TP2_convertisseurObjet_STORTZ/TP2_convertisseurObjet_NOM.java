/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_convertisseurObjet_STORTZ;

import java.util.Scanner;

/**
 *
 * @author basilestortz
 */
public class TP2_convertisseurObjet_NOM {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float var;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisez une valeur de tempereature a convertir ");
        var= sc.nextFloat();
        System.out.println("""
                           Saisissez la conversion que vous souhaiter effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Farenheit Vers Celcius
                           4) De Celcius Vers Farenheit
                           5) De Kelvin Vers Farenheit
                           6) De Farenheit Vers Kelvin""");
        Convertisseur conv1 = new Convertisseur();
        int conv=sc.nextInt();
        switch (conv) {
            case 1:
                System.out.println(conv1.CelciusVersKelvin(var)+"K");
                break;
            case 2:
                System.out.println(conv1.KelvinVersCelcius(var)+"C");
                break;
            case 3:
                System.out.println(conv1.FarenheitVersCelcius(var)+"C");
                break;
            case 4:
                System.out.println(conv1.CelciusVersFarenheit(var)+"F");
                break;
            case 5:
                System.out.println(conv1.KelvinVersFarenheit(var)+"F");
                break;
            case 6:
                System.out.println(conv1.FarenheitVersKelvin(var)+"K");
                break;
            default:
                System.out.println("C'est pas le bon nombre");
                break;
        }
            }
   
}

