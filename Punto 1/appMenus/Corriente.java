package appMenus;

public class Corriente {
    public static double calcularCorriente(double voltaje, double resistencia){
        double corriente;
        corriente = voltaje / resistencia;
        return corriente;
    }
}
