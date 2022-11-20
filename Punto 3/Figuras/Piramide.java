/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author User
 */
public class Piramide {
    double base;
    double altura;
    double apotema;
    double volumen;
    double superficie;
    
    public double CalcularVolumen(double base, double altura){
        double Vol = (Math.pow(base, 2.0) * altura)/ 3.0;
        return Vol;
    }
    
    public double CalcularSuperficie(double base, double altura, double apotema){
        double areaBase = Math.pow(base, 2.0);
        double areaCara = 2.0 * base * apotema;
        double Sup = areaBase + areaCara;
        return Sup;
    }
    
    public Piramide(double base, double altura, double apotema){
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.volumen = this.CalcularVolumen(base, altura);
        this.superficie = this.CalcularSuperficie(base, altura, apotema);
    }
}
