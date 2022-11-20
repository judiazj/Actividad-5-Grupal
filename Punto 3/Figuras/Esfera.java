/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author User
 */
public class Esfera {
    double radio;
    double volumen;
    double superficie;
    
    public double CalcularVolumen(double radio){
        double Vol = (4.0/3.0) * Math.PI * Math.pow(radio, 3.0);
        return Vol;
    }
    
    public double CalcularSuperficie(double radio){
        double Sup = 4.0 * Math.PI * Math.pow(radio, 2.0);
        return Sup;
    }
    
    public Esfera(double radio){
        this.radio = radio;
        this.volumen = this.CalcularVolumen(radio);
        this.superficie = this.CalcularSuperficie(radio);
    }
}