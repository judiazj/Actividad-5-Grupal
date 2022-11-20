/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author User
 */
public class Cubo {
    double lado;
    double volumen;
    double superficie;
    
    public double CalcularVolumen(double lado){
        double Vol = Math.pow(lado, 3);
        return Vol;
    }
    
    public double CalcularSuperficie(double lado){
        double Sup = 6 * Math.pow(lado, 2);
        return Sup;
    }
    
    public Cubo(double lado){
        this.lado = lado;
        this.volumen = this.CalcularVolumen(lado);
        this.superficie = this.CalcularSuperficie(lado);
    }
}