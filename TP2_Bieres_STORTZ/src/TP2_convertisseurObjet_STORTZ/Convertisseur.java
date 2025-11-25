/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_convertisseurObjet_STORTZ;

/**
 *
 * @author basilestortz
 */
public class Convertisseur {
    int nbConversions;
   
    public Convertisseur () {
    nbConversions = 0 ;
    }
    public float CelciusVersKelvin (float tCelcius) {
        float tKelvin;
        nbConversions++;
        tKelvin = tCelcius+273;
        return tKelvin ;
    }
    public float KelvinVersCelcius (float tKelvin) {
        float tCelcius;
        nbConversions++;
        tCelcius = tKelvin-273;
        return tCelcius;  
    }
    public float FarenheitVersCelcius (float tFaren) {
        float tCelcius;
        nbConversions++;
        tCelcius = tFaren+17;
        return tCelcius;  
    }
    public float CelciusVersFarenheit (float tCelcius) {
        float tFaren;
        nbConversions++;
        tFaren = tCelcius-17;
        return tFaren;  
    }
    public float KelvinVersFarenheit (float tKelvin) {
        float tFaren;
        nbConversions++;
        tFaren = tKelvin-255;
        return tFaren;  
    }
    public float FarenheitVersKelvin (float tFaren) {
        float tKelvin;
        nbConversions++;
        tKelvin = tFaren-255;
        return tKelvin;  
    }
    @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
    }
   
   
   
}
