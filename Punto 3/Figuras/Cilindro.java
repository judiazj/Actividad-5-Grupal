/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author User
 */
public class Cilindro {
    double radio;
    double altura;
    double volumen;
    double superficie;
    
    public double CalcularVolumen(double radio, double altura){
        double Vol = Math.PI  *  Math.pow(radio, 2.0) * altura;
        return Vol;
    }
    
    public double CalcularSuperficie(double radio, double altura){
        double areaCir = 2.0 * Math.PI * Math.pow(radio, 2.0);
        double areaCil = 2.0 * Math.PI * radio * altura;
        double Sup = areaCir +areaCil;
        return Sup;
    }
    
    public Cilindro (double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.volumen = this.CalcularVolumen(radio, altura);
        this.superficie = this.CalcularSuperficie(radio, altura);
    }
}
