/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author User
 */
public class Prisma {
    int cara;
    double lado;
    double altura;
    double volumen;
    double superficie;
    
    public double CalcularVolumen(int cara, double lado, double altura){
        double Vol = (cara/4.0)*altura*Math.pow(lado, 2)*(1/Math.tan((Math.PI/cara)));
        return Vol;
    }
    
    public double CalcularSuperficie(int cara, double lado, double altura){
        double Sup = (cara/2.0)*Math.pow(lado, 2)*(1/Math.tan((Math.PI/cara))) + cara*lado*altura;
        return Sup;
    }
    
    public Prisma(int cara, double lado, double altura){
        this.cara = cara;
        this.lado = lado;
        this.altura = altura;
        this.volumen = this.CalcularVolumen(cara, lado, altura);
        this.superficie = this.CalcularSuperficie(cara, lado, altura);
    }
}
